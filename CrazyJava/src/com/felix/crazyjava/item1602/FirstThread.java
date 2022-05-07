package com.felix.crazyjava.item1602;

/**
 * Created by Felix on 2017/2/13.
 */
public class FirstThread  extends Thread{

    private int i;

    @Override
    public void run() {
        for ( ; i < 100; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + i);

            if (i == 20) {
                // 这两个线程不会共享变量i
                new FirstThread().start();
                new FirstThread().start();
            }
        }
    }
}
