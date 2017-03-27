package com.felix.crazyjava.item0603;

/**
 * Created with IntelliJ IDEA.
 * Description: 使用对象来访问类成员时，实际上是委托给该类来访问类成员
 *              因此即使某个实例为null，它也可以访问它所属的类的类成员
 * Author: Felix
 * Date: 2017/3/27
 * Time: 20:58
 */
public class NullAccessStatic {

    private static void test() {
        System.out.println("static 修饰的类方法");
    }

    public static void main(String[] args) {
        NullAccessStatic nas = null;
        nas.test();
    }

}
