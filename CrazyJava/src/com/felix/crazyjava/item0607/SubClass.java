package com.felix.crazyjava.item0607;

/**
 * Created with IntelliJ IDEA.
 * Description: 多态性
 * Author: Felix
 * Date: 2018/1/5
 * Time: 16:49
 */

class BaseClass {
    public int book = 6;
    public void base() {
        System.out.println("父类的普通方法");
    }
    public void test() {
        System.out.println("父类被覆盖的方法");
    }
}

public class SubClass extends BaseClass {
    public String book = "疯狂java讲义";

    public void sub() {
        System.out.println("子类的普通方法");
    }

    @Override
    public void test() {
        System.out.println("子类的覆盖父类的方法");
    }

    public static void main(String[] args) {
        // 下面编译时类型和运行时类型不一样，多态发生
        BaseClass baseClass = new SubClass();
        System.out.println(baseClass.book);
        baseClass.base();
        baseClass.test();
        // baseClass.sub();
    }
}
