package com.felix.thinkjava.chapter08;

/**
 * Created by Felix on 2016/6/4.
 */
public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    @Override
    public void test() {
        System.out.println("Square.test()");
    }

}
