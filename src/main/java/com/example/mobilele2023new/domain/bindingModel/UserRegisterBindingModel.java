package com.example.mobilele2023new.domain.bindingModel;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class UserRegisterBindingModel {

    @Size(min = 2, max = 20, message = "First name length must be more than 2 characters")
    private String firstName;
    @Size(min = 2, max = 20, message = "Full name length must be more than 2 characters")
    private String lastName;
    @Size(min = 2, max = 20, message = "Username length must be more than 2 characters")
    private String username;
    @Email
    private String email;
    @Size(min = 2, max = 20, message = "Password length must be more than 2 characters")
    private String password;
    @Size(min = 2, max = 20, message = "Password length must be more than 2 characters")
    private String confirmPassword;

    public UserRegisterBindingModel() {
    }

    public String getFirstName() {
        return firstName;
    }

    public UserRegisterBindingModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserRegisterBindingModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserRegisterBindingModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserRegisterBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegisterBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegisterBindingModel setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}
