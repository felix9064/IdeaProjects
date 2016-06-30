package com.felix.thinkjava.chapter08;

/**
 * Created by Felix on 2016/6/4.
 */
public class Stringed extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjust Stringed");
    }
}
