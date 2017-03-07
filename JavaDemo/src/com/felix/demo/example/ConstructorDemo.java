package com.felix.demo.example;

/**
 * Created by Felix on 2016/7/14.
 * 如果一个类提供了构造器，则系统不会提供默认的构造器
 * 反之，如果一个类没有提供构造器，则系统会提供一个不带参数的默认构造器
 */
public class ConstructorDemo {

    private String name;

    public ConstructorDemo(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public static void main(String[] args) {
        // 由于类提供了构造器，所以此处不能调用默认构造器
        // ConstructorDemo constructorDemo = new ConstructorDemo();
        ConstructorDemo constructorDemo = new ConstructorDemo("Hello");
        System.out.println(constructorDemo.getName());

        constructorDemo.setName("Felix");
        System.out.println(constructorDemo.getName());

    }
}