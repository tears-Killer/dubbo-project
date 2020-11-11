package com.chinasoft.service;

import com.chinasoft.pojo.User;

public interface UserService {
    User getUser(String name, Integer age);
}
