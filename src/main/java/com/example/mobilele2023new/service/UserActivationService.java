package com.example.mobilele2023new.service;

import com.example.mobilele2023new.domain.events.UserRegisteredEvent;

public interface UserActivationService {

    void userRegistered(UserRegisteredEvent event);
}
