package com.chinasoft.service.impl;

import com.chinasoft.pojo.User;
import com.chinasoft.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User uDetails(int id, String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        System.out.println(user);
        return user;
    }
}
