package com.felix.thinkjava.chapter08;

/**
 * Created by Felix on 2016/5/20.
 */
public class Wind extends Instrument{

    @Override
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjust Wind");
    }
}

