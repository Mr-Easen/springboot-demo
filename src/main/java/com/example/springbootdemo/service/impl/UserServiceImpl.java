package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dao.UserDao;
import com.example.springbootdemo.model.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(String id) {
        return userDao.getUserById(id);
    }

    @Override
    public int delUserById(String id) {
        return userDao.delUserById(id);
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
