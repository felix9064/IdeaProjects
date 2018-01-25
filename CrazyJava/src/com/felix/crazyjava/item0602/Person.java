package com.felix.crazyjava.item0602;

/**
 * Created with IntelliJ IDEA.
 * Description: 重写toString()方法
 * Author: Felix
 * Date: 2017/3/17
 * Time: 14:45
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        Person p = new Person("张三");

        System.out.println(p);
    }
}
