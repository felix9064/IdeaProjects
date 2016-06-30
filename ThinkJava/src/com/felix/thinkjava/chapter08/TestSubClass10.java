package com.felix.thinkjava.chapter08;

/**
 * Created by Felix on 2016/6/4.
 */
public class TestSubClass10 extends TestSuperClass10 {

    @Override
    public void print(String str) {
        System.out.println("子类输出：" + str);
    }

    public static void main(String[] args) {

        TestSuperClass10 sup = new TestSubClass10();
        sup.doSomething();

    }
}
