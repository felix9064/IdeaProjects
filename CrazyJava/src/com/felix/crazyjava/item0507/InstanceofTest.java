package com.felix.crazyjava.item0507;

/**
 * Created with IntelliJ IDEA.
 * Description: Java中的instanceof运算符
 * Author: Felix
 * Date: 2018/1/19
 * Time: 15:03
 */
public class InstanceofTest {
    public static void main(String[] args) {
        Object hello = "Hello";
        System.out.println("字符串是否是Object类的实例：" + (hello instanceof Object));

        System.out.println("字符串是否是String类的实例：" + (hello instanceof String));

        System.out.println("字符串是否是Math类的实例：" + (hello instanceof Math));

        SubClass subClass = new SubClass();
        System.out.println("subClass是否是BaseClass类的实例：" + (subClass instanceof BaseClass));
    }
}
