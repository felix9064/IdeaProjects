package com.felix.crazyjava.item1604;

/**
 * Created with IntelliJ IDEA.
 * Description: 创建守护线程
 * Author: Felix
 * Date: 2017/3/8
 * Time: 10:20
 */
public class DaemonThread extends Thread {

    // 定义守护线程的线程执行体与普通线程没有任何区别
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) throws Exception {
        DaemonThread dt = new DaemonThread();
        // 将此线程设置成守护线程，该语句必须在线程启动之前
        dt.setDaemon(true);
        // 启动线程
        dt.start();
        // Thread.sleep(1);
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        // 程序执行到此处，前台线程（main线程）结束
        // 守护线程也应该随之结束
    }
}
