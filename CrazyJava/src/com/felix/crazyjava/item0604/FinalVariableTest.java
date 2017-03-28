package com.felix.crazyjava.item0604;

/**
 * Created with IntelliJ IDEA.
 * Description: final修饰成员变量
 * Author: Felix
 * Date: 2017/3/28
 * Time: 9:46
 */
public class FinalVariableTest {

    final int a = 6;

    final String str;
    final int c;

    final static double d;

    // final char ch;

    // 非静态初始化块
    {
        str = "Hello";
        // a = 9;
    }

    // 静态初始化块
    static {
        d = 5.6;
    }

    public FinalVariableTest() {
        c = 5;
    }

    public void changeFinal() {
        // d = 1.2;
        // ch = 'a';
    }

    public static void main(String[] args) {
        FinalVariableTest fvt = new FinalVariableTest();
        System.out.println(fvt.a);
        System.out.println(fvt.c);
        System.out.println(fvt.d);
    }
}
