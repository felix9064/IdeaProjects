package com.felix.thinkjava.chapter08;

/**
 * Created by Felix on 2016/6/4.
 */
public class Brass extends Wind {

    @Override
    public void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjust Brass");
    }
}
