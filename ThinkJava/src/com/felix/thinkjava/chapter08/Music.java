package com.felix.thinkjava.chapter08;

/**
 * Created by Felix on 2016/5/20.
 */
public class Music {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
