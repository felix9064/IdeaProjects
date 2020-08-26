package com.felix.demo.thread;

public class ThreadTest {

    public static void main(String[] args) {

        int num = 0;
        int maxCount = 5;
        int count = 0;


        final Object lock = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }, "进货").start();


        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }, "销售").start();
    }

}
