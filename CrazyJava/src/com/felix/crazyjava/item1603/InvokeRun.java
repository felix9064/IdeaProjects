package com.felix.crazyjava.item1603;

/**
 * Created with IntelliJ IDEA.
 * Description: 线程对象直接调用run()方法，而不是调用start()方法启动线程，这样的程序是单线程
 * Author: Felix
 * Date: 2017/3/7
 * Time: 14:22
 */
public class InvokeRun extends Thread{

    private int i;

    @Override
    public void run() {
        for ( ;  i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                // 直接调用线程对象的run()方法
                // 系统会把线程对象当成普通对象，把run()方法当成普通方法
                // 所以下面两行代码并不会启动两个线程，而是依次执行两个run()方法
                new InvokeRun().run();
                new InvokeRun().run();
            }
        }
    }
}
