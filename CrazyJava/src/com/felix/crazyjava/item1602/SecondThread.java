package com.felix.crazyjava.item1602;

/**
 * Created by Felix on 2017/3/2.
 */
public class SecondThread implements Runnable {

    private int i;

    @Override
    public void run() {
        for ( ; i < 100; i++) {
            // 当线程类实现Runnable接口时，
            // 如果想获取当前线程，只能用Thread.currentThread()方法
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                // 创建Runnable实现类的对象st
                SecondThread st = new SecondThread();
                // 此处的 st 实例作为Thread的target来创建Thread对象
                // 由于新创建的两个线程的target是同一个对象st，所以这两个线程会共享变量i
                new Thread(st, "新线程1").start();
                new Thread(st, "新线程2").start();
            }
        }
    }
}
