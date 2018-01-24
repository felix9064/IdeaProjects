package com.felix.crazyjava.item0507;

/**
 * Created with IntelliJ IDEA.
 * Description: java的多态性
 * Author: Felix
 * Date: 2018/1/19
 * Time: 14:17
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
    public String book = "疯狂Java";
    public void sub() {
        System.out.println("子类的普通方法");
    }

    @Override
    public void test() {
        System.out.println("子类的覆盖父类的方法");
    }

    public static void main(String[] args) {
        // 编译类型和运行类型一致，不存在多态性
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);
        bc.base();
        bc.test();

        // 编译类型和运行类型一致，也不存在多态性
        SubClass sc = new SubClass();
        System.out.println(sc.book);
        sc.sub();
        sc.test();
        sc.base();

        // 编译类型和运行类型不一致，故存在多态性
        BaseClass baseClass = new SubClass();
        System.out.println(baseClass.book);
        System.out.println( ((SubClass)baseClass).book);
        // 调用的是从父类继承的方法
        baseClass.base();
        // 多态性，此处实际运行时调用的是子类的test方法
        baseClass.test();

        ((SubClass) baseClass).sub();
    }
}


