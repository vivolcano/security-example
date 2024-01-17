package ru.netology.securityexample.controller;

import org.springframework.http.ResponseEntity;
import ru.netology.securityexample.dto.LoginRequest;
import ru.netology.securityexample.dto.LoginResponse;

public interface AuthController {
    ResponseEntity<LoginResponse> login(LoginRequest loginRequest);
    ResponseEntity<Void> logout(String authToken);
}