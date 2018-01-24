package com.felix.crazyjava.item0601;

/**
 * Created with IntelliJ IDEA.
 * Description: Java 8 针对整型包装类提供了支持无符号运算的方法
 * Author: Felix
 * Date: 2017/3/20
 * Time: 12:51
 */
public class UnsignedTest {

    public static void main(String[] args) {
        byte b = -3;

        // 将byte类型的-3转换为无符号整数
        System.out.println("byte类型的-3对应的无符号整数：" + Byte.toUnsignedInt(b));

        int val = Integer.parseUnsignedInt("ab", 16);
        System.out.println(val);

        System.out.println(Integer.toUnsignedString(-12, 10));

    }
}
