package com.felix.spring.demo;

/**
 * Created by Felix on 2016/7/8.
 */
public class HelloMessage {

    private String message;

    public void getMessage() {
        System.out.println("Bean的消息: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public void init() {
        System.out.println("HelloMessage初始化Bean");
    }

    public void destroy() {
        System.out.println("HelloMessage销毁Bean");
    }
}
