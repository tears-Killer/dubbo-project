package com.chinasoft.service.impl;

import com.chinasoft.pojo.User;
import com.chinasoft.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String name, Integer age) {
        User  user = new User(name,age);
        return user;
    }
}
