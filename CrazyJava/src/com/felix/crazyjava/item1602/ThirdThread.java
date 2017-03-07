package com.felix.crazyjava.item1602;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by Felix on 2017/3/7.
 */
public class ThirdThread implements Callable<Integer> {

    public static void main(String[] args) {

        ThirdThread rt = new ThirdThread();
        FutureTask<Integer> task = new FutureTask<> (rt);
        // 先使用Lambda表达式创建Callable<Integer>对象
        // 使用FutureTask来包装Callable对象

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " 的循环变量 i 的值：" + i);

            if (i == 20) {
                // 实质还是以Callable对象来创建并启动线程的
                new Thread(task, "有返回值的线程").start();
            }
            try {
                System.out.println("子线程的返回值：" + task.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Integer call() throws Exception {
        int i = 0;
        for ( ;  i < 100; i ++) {
            System.out.println(Thread.currentThread().getName() + " 的循环变量 i 的值：" + i);
        }
        return i;
    }
}
