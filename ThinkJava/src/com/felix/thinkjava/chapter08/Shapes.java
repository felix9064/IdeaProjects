package com.felix.thinkjava.chapter08;

/**
 * Created by Felix on 2016/6/4.
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];

        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }

        for (Shape shp : s) {
            shp.test();

        }

    }
}
