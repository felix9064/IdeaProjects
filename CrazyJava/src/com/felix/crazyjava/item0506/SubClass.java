package com.felix.crazyjava.item0506;

/**
 * Created with IntelliJ IDEA.
 * Description: 当子类和父类定义了同名的实例变量时，
 *              父类的实例变量会被子类的隐藏，可以通过super关键字来访问父类的实例变量
 * Author: Felix
 * Date: 2018/1/5
 * Time: 15:33
 */

class BaseClass {
    public int a = 5;
}

public class SubClass extends BaseClass {
    public int a = 7;

    public void accessOwner() {
        System.out.println(a);
    }

    public void accessBase() {
        // 通过super来限定访问从父类继承得到的a实例变量
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.accessOwner();
        sc.accessBase();
    }
}


