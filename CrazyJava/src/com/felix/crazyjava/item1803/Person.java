package com.felix.crazyjava.item1803;

/**
 * Created with IntelliJ IDEA.
 * Description: 为反射提供的类
 * Author: Felix
 * Date: 2017/4/8
 * Time: 17:16
 */
@SuppressWarnings("unchecked")
public class Person {

    private String name;
    private int age;


    private Person() {
        System.out.println("调用不带参数的私有构造器");
    }

    private Person(String name, int age) {
        System.out.println("调用带参数的私有构造器");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
