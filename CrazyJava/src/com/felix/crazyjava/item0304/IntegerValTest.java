package com.felix.crazyjava.item0304;

/**
 * Created with IntelliJ IDEA.
 * Description: 整型的4种进制表示方式，二进制，八进制，十进制，十六进制
 * Author: Felix
 * Date: 2017/3/21
 * Time: 15:08
 */
public class IntegerValTest {

    public static void main(String[] args) {
        // 八进制是以0开头的
        int octalValue = 013;

        // 以0x或0X开头的整数值是十六进制的整数
        int hexValue1 = 0x13;
        int hexValue2 = 0XaF;

        // 定义两个8位的二进制整数
        int binVal1 = 0b11010100;
        byte binVal2 = 0B01101001;

        System.out.println(octalValue);
        System.out.println(hexValue1);
        System.out.println(hexValue2);
        System.out.println(binVal1);
        System.out.println(binVal2);

    }

}
