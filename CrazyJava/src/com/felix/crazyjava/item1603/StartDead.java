package com.felix.crazyjava.item1603;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/3/7
 * Time: 20:26
 */
public class StartDead extends Thread {

    private int i;

    @Override
    public void run() {
        for ( ; i < 100; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        // 创建线程对象
        StartDead sd = new StartDead();

        for (int i = 0; i < 300; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            if (i == 20) {
                // 启动线程
                sd.start();
                // 判断启动后线程的isAlive()值
                System.out.println(sd.isAlive());
            }

            //TODO 此处必须要等到线程体执行完，故加上线程是否已死亡的判断
            if (i > 20 && !sd.isAlive()) {
                // 试图再次启动该线程
                // 有可能不会抛异常，即在主线程已经执行完而子线程还处于新建或就绪状态时
                sd.start();
            }
            
        }
    }
}
