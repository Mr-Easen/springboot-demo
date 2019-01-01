package com.example.springbootdemo.service;

import com.example.springbootdemo.model.User;

public interface UserService {
    User getUserById(String id);

    int delUserById(String id);

    int addUser(User user);
}
