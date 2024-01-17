package ru.netology.securityexample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.netology.securityexample.dto.LoginRequest;
import ru.netology.securityexample.dto.LoginResponse;
import ru.netology.securityexample.service.AuthService;

@RequestMapping("/cloud")
@RestController
@RequiredArgsConstructor
public class AuthControllerImpl {
    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        final var response = authService.login(loginRequest);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/logout")
    public ResponseEntity<Void> logout(@RequestHeader("auth-token") String authToken) {
        authService.logout(authToken);
        return ResponseEntity.ok().build();
    }
}