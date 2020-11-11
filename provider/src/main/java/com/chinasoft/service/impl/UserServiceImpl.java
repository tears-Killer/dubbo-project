package com.chinasoft.service.impl;

import com.chinasoft.pojo.User;
import com.chinasoft.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User selectById(int id) {
        User user = new User();
        user.setId(1);
        user.setName("wzx");
        user.setAge(22);
        return user;
    }
}
