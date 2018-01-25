package com.felix.crazyjava.item0604;

/**
 * Created with IntelliJ IDEA.
 * Description: final修饰的局部变量，如果在定义时已指定初始值，则后面代码中不能再对该变量赋值
 *              如果在定义时没有指定初始值，则在后面的代码中可以对该变量赋值，但只能一次，不能重复赋值
 * Author: Felix
 * Date: 2018/1/25
 * Time: 11:00
 */
public class FinalLocalVariableTest {

    public int test(final int a) {
        // 不能对final修饰的形参赋值，下面语句非法
        // a = 5;
        return a + 5;
    }

    public static void main(String[] args) {
        final String str = "hello";
        // str = "Java";
        System.out.println(str);


        final double d;
        d = 5.6;
        // d = 3.4;
        System.out.println(d);

        FinalLocalVariableTest flvt = new FinalLocalVariableTest();
        System.out.println(flvt.test(5));
    }
}
