package com.felix.crazyjava.item0607;

/**
 * Created with IntelliJ IDEA.
 * Description: 在外部访问非静态内部类的成员变量时，必须先创建内部类的实例，在通过实例来访问
 * Author: Felix
 * Date: 2018/1/31
 * Time: 16:52
 */
public class Outer {
    private int outProp = 9;

    class Inner {
        private int inProp = 5;
        public void acessOuterProp() {
            System.out.println("外部类的outProp值：" + outProp);
        }
    }

    public void acessInnerProp() {
        // 外部类无法直接访问
        //System.out.println(inProp);

        System.out.println("内部类的inProp值：" + new Inner().inProp);
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.acessInnerProp();
    }
}
