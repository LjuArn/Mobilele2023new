package com.example.mobilele2023new.service;

import com.example.mobilele2023new.domain.entity.UserEntity;
import com.example.mobilele2023new.domain.events.UserRegisteredEvent;
import com.example.mobilele2023new.domain.serviceModel.UserServiceModel;
import com.example.mobilele2023new.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;
    private final ApplicationEventPublisher applicationEventPublisher;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper,
                           PasswordEncoder passwordEncoder,
                           ApplicationEventPublisher applicationEventPublisher) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
        this.applicationEventPublisher = applicationEventPublisher;
    }


    @Override
    public void registerUser(UserServiceModel userServiceModel) {
        UserEntity user = modelMapper.map(userServiceModel, UserEntity.class);
        user.setActive(false);
        user.setPassword(passwordEncoder.encode(userServiceModel.getPassword()));
        userRepository.save(user);

        applicationEventPublisher
                .publishEvent(new UserRegisteredEvent("UserService",
                        userServiceModel.getEmail(),
                        userServiceModel.getUsername()));
    }


//    @Override
//    public void registerUser(UserServiceModel userServiceModel) {
//        User user = modelMapper.map(userServiceModel, User.class);
//        user.setLevel(LevelEnum.BEGINNER);
//        user.setPassword(passwordEncoder.encode(userServiceModel.getPassword()));
//
//        userRepository.save(user);
//    }


//    @Override
//    public boolean isNameExistMethod(String username) {
//        return userRepository.findByUsername(username).isPresent();
//    }
//

//    @Override
//    public UserServiceModel findUserByUsernameAndPassword(String username, String password) {
//        return userRepository.findByUsernameAndPassword(username, password)
//                .map(userEntity -> modelMapper.map(userEntity, UserServiceModel.class))
//                .orElse(null);
//    }

//    @Override
//    public void loginUser(Long id, String username) {
//        currentUser.setId(id).setUsername(username);
//    }
//
//    @Override
//    public void logOut() {
//        currentUser.setId(null).setUsername(null);
//    }
}
