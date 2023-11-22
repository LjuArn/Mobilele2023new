package com.example.mobilele2023new.service;

import com.example.mobilele2023new.domain.events.UserRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserActivationServiceImpl implements UserActivationService {



    @Override
    @EventListener(UserRegisteredEvent.class)
    public void userRegistered(UserRegisteredEvent event) {

        //TO DO Activation Links
        System.out.println("User with Email" + event.getUserEmail());
    }
}
