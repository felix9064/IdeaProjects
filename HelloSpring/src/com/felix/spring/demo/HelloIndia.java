package com.felix.spring.demo;

/**
 * Created by Felix on 2016/7/13.
 */
public class HelloIndia {

    private String hello;
    private String message;

    public void getMessage() {
        System.out.println("HelloIndia的Message消息: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public void getHello() {
        System.out.println("HelloIndia的Hello消息: " + hello);;
    }

    public void init() {
        System.out.println("HelloIndia初始化Bean");
    }

    public void destroy() {
        System.out.println("HelloIndia销毁Bean");
    }
}
