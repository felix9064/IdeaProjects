package com.felix.crazyjava.item1605;

/**
 * Created with IntelliJ IDEA.
 * Description: 当两个线程互相等待对方释放同步监视器时就会发生死锁的情况
 * Author: Felix
 * Date: 2017/3/9
 * Time: 13:15
 */
public class DeadLock implements Runnable {

    A a = new A();
    B b = new B();
    public void init() {
        Thread.currentThread().setName("主线程");
        a.foo(b);
        System.out.println("进入了主线程之后");
    }

    @Override
    public void run() {
        Thread.currentThread().setName("副线程");
        b.bar(a);
        System.out.println("进入了副线程之后");
    }

    public static void main(String[] args) {
        DeadLock dl = new DeadLock();
        new Thread(dl).start();
        dl.init();
    }
}

class A {
    public synchronized void foo (B b) {
        System.out.println("当前线程名：" + Thread.currentThread().getName() + " 进入了A实例的foo()方法");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程名：" + Thread.currentThread().getName() + " 企图调用B实例的last()方法");
        b.last();
    }

    public synchronized void last() {
        System.out.println("进入了A类的last()方法内部");
    }
}

class B {
    public synchronized void bar (A a) {
        System.out.println("当前线程名：" + Thread.currentThread().getName() + " 进入了B实例的bar()方法");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程名：" + Thread.currentThread().getName() + " 企图调用A实例的last()方法");
        a.last();
    }

    public synchronized void last () {
        System.out.println("进入了B类的last()方法内部");
    }
}
