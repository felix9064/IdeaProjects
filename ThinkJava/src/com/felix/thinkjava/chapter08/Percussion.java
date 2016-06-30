package com.felix.thinkjava.chapter08;

/**
 * Created by Felix on 2016/6/4.
 */
public class Percussion extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjust Percussion");
    }
}
