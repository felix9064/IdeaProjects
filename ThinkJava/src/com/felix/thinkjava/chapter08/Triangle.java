package com.felix.thinkjava.chapter08;

/**
 * Created by Felix on 2016/6/4.
 */
public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void test() {
        System.out.println("Triangle.test()");
    }
}
