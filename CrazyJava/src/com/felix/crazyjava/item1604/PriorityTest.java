package com.felix.crazyjava.item1604;

/**
 * Created with IntelliJ IDEA.
 * Description: 设置线程的优先级setPriority()，其值可以是1~10之间的整数
 * Author: Felix
 * Date: 2017/3/8
 * Time: 12:45
 */
public class PriorityTest extends Thread {

    private PriorityTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(getName() + "， 其优先级是：" + getPriority() + "， 循环变量的值为：" + i);
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + "线程的默认优先级："
                + Thread.currentThread().getPriority());

        // 改变main线程的优先级
        Thread.currentThread().setPriority(6);

        for (int i = 0; i < 30; i++) {
            System.out.println("修改后" + Thread.currentThread().getName() +
                    "线程的优先级：" + Thread.currentThread().getPriority() + "， 循环变量为：" + i);

            if (i == 10) {
                PriorityTest low = new PriorityTest("低级线程");
                low.start();
                System.out.println("low线程创建之处的优先级：" + low.getPriority());
                // 设置该线程为最低优先级
                low.setPriority(Thread.MIN_PRIORITY);
            }

            if (i == 20) {
                PriorityTest high = new PriorityTest("高级线程");
                high.start();
                System.out.println("high线程创建之处的优先级：" + high.getPriority());
                // 设置该线程为最高优先级
                high.setPriority(Thread.MAX_PRIORITY);
            }
        }
    }

}
