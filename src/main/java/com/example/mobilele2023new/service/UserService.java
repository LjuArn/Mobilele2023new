package com.example.mobilele2023new.service;

import com.example.mobilele2023new.domain.bindingModel.UserRegisterBindingModel;
import com.example.mobilele2023new.domain.serviceModel.UserServiceModel;

public interface UserService {
    void registerUser(UserServiceModel userServiceModel);

    boolean isNameExistMethod(String username);

    UserServiceModel findUserByUsernameAndPassword(String username, String password);

    void loginUser(Long id, String username);

    void logOut();
}
