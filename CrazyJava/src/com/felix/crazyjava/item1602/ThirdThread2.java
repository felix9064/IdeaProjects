package com.felix.crazyjava.item1602;

import java.util.concurrent.FutureTask;

/**
 * ClassName: ThirdThread2
 * Description: ThirdThread的另一种实现方式
 * Author: Felix
 * Date: 2022-05-07
 * Time: 9:29
 */
public class ThirdThread2 {

    public static void main(String[] args) {

        FutureTask<Integer> task = new FutureTask<>(() -> {
            int i = 0;
            for (; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " 的循环变量 i 的值：" + i);
            }
            return i;
        });

        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + " 的循环变量 i 的值：" + i);
            if (i == 20) {
                // 实质还是以Callable对象来创建并启动线程的
                new Thread(task, "有返回值的线程").start();
            }
        }
        try {
            System.out.println("子线程的返回值：" + task.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
