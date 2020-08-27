package com.felix.demo.thread;

public class ThreadTest {

    public static int num = 0;
    public final static int MAX_NUM = 5;
    public static int count = 0;
    public final static int MAX_COUNT = 10;

    public static void main(String[] args) {

        System.out.println("当前线程：" + Thread.currentThread().getName());
        System.out.println("当前线程是否为守护线程：" + Thread.currentThread().isDaemon());

        final Object lock = new Object();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                synchronized (lock) {
                    while (true) {
                        if (count == MAX_COUNT) {
                            try {
                                System.out.println(threadName + "：QQ达到最大数量了，停止进货，等卖完了再进吧");
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        try {
                            Thread.sleep(500);
                            count++;
                            System.out.println(threadName + "：进一台QQ，店里现在一共有：" + count + " 台QQ了");

                            if (count == MAX_COUNT) {
                                lock.notifyAll();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        }, "进货");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                synchronized (lock) {
                    while (num < MAX_NUM) {
                        if (count == 0 ) {
                            try {
                                System.out.println(threadName + "：QQ卖完了，需要进货了才能卖，快进货吧");
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        try {
                            Thread.sleep(500);
                            count--;
                            System.out.println(threadName + "：卖了一台QQ，店里还剩：" + count + "台QQ了");

                            if (count == 0) {
                                num++;
                                System.out.println(threadName + "：一共要卖 " + MAX_NUM * MAX_COUNT + " 台QQ，现在已经卖了 " + num * MAX_COUNT + " 台QQ了" );
                                if (num < MAX_NUM) {
                                    lock.notifyAll();
                                }

                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }

                    System.out.println(threadName + "：已经卖完 " + MAX_NUM * MAX_COUNT + " 台QQ了，销售目标完美达成了，任务结束");
                }
            }
        }, "销售");

        thread1.start();
        thread2.start();

    }

}
