package com.example.springbootdemo.dao;

import com.example.springbootdemo.model.User;

public interface UserDao {
    User getUserById(String id);

    int delUserById(String id);

    int addUser(User user);
}
