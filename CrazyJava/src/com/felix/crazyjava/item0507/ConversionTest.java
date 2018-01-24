package com.felix.crazyjava.item0507;

/**
 * Created with IntelliJ IDEA.
 * Description: Java类型强制转换
 * Author: Felix
 * Date: 2018/1/19
 * Time: 14:53
 */
public class ConversionTest {
    public static void main(String[] args) {
        double b = 13.4;
        long l = (long) b;
        System.out.println(l);

        Object obj = "Hello";
        String objStr = (String) obj;
        System.out.println(objStr);
    }
}
