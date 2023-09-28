package com.minis.test;


import com.minis.beans.BeansException;
import com.minis.context.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) throws BeansException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AService aService = (AService) ctx.getBean("aservice");
        aService.sayHello();
        System.out.println(((AServiceImpl) aService).getProperty1());
        ((AServiceImpl) aService).setProperty1("666666");
        System.out.println(((AServiceImpl) aService).getProperty1());
    }
}
