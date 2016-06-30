package com.felix.thinkjava.chapter08;

/**
 * Created by Felix on 2016/6/4.
 */
public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Cirlce.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Cirlce.erase()");
    }

    @Override
    public void test() {
        System.out.println("Circle.test()");
    }
}
