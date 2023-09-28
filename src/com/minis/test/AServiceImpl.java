package com.minis.test;

public class AServiceImpl implements AService {

    // Setter 注入
    private String property1;

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public void sayHello() {
        System.out.println("Hello !!!!");
    }


}
