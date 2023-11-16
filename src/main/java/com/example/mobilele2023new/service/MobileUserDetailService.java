package com.example.mobilele2023new.service;//package com.example.mobilele2023new.service;

import com.example.mobilele2023new.domain.entity.UserEntity;
import com.example.mobilele2023new.domain.entity.UserRoleEntity;
import com.example.mobilele2023new.domain.enums.UserRoleEnum;
import com.example.mobilele2023new.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.stream.Collectors;

public class MobileUserDetailService implements UserDetailsService {

   private final UserRepository userRepository;

    public MobileUserDetailService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .map(this::userDetails)
                .orElseThrow(() -> new UsernameNotFoundException("User with username" + username + "not found!!"));
    }




    private UserDetails userDetails(UserEntity userEntity) {
        return
                User.withUsername(userEntity.getUsername())
                        .password(userEntity.getPassword())
                        .authorities(userEntity
                                .getRoles()
                                .stream()
                                .map(this::grantedAuthority)
                                .collect(Collectors.toSet()))
                        .build();
    }

    private GrantedAuthority grantedAuthority(UserRoleEntity userRoleEntity) {
        return new SimpleGrantedAuthority("ROLE_" + userRoleEntity.getRole().name());
    }


}
