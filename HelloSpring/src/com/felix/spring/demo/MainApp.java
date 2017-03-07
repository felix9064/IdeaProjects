package com.felix.spring.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Felix on 2016/7/8.
 */
public class MainApp {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

/*
        HelloMessage message = (HelloMessage) context.getBean("hello_world");
        message.getMessage();
        context.registerShutdownHook();

        message = (HelloMessage)context.getBean("hello_felix");
        message.getMessage();
*/

        HelloMessage messA = (HelloMessage) context.getBean("hello_world");
        messA.getMessage();
        context.registerShutdownHook();

        HelloIndia india = (HelloIndia) context.getBean("hello_india");
        india.getHello();
        india.getMessage();

    }

}
