package com.chinasoft.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestProvider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
