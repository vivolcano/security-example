package ru.netology.securityexample.service;

import ru.netology.securityexample.dto.LoginRequest;
import ru.netology.securityexample.dto.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    void logout(String authToken);
}