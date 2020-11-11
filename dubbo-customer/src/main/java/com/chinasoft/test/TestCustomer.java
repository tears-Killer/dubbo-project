package com.chinasoft.test;

import com.chinasoft.pojo.User;
import com.chinasoft.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-customer.xml"});
        context.start();
        UserService demoService = (UserService)context.getBean("userService"); // 获取远程服务代理
        User user = demoService.getUser("wj", 22);
        System.out.println(user.getName());
    }
}
