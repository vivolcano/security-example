package ru.netology.securityexample.service;

import ru.netology.securityexample.entity.User;

public interface UserService {
    User getByLogin(String username);
}