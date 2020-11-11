package com.chinasoft.controller;

import com.chinasoft.pojo.User;
import com.chinasoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/user")
    public String uDetails( Model model){
        User user = userService.uDetails(1, "wj");
        model.addAttribute("user",user);
        System.out.println(model);
        return "index";
    }
}
