package com.felix.crazyjava.item0602;

/**
 * Created with IntelliJ IDEA.
 * Description: JVM使用常量池来管理字符串常量
 * Author: Felix
 * Date: 2018/1/24
 * Time: 16:50
 */
public class StringCompareTest {
    public static void main(String[] args) {
        // 从s1到s5这些变量的值在编译时就可以确定
        String s1 = "疯狂Java";
        String s2 = "疯狂";
        String s3 = "Java";
        String s4 = "疯狂" + "Java";
        String s5 = "疯" + "狂" + "Java";

        // s6变量的值在编译时不能确定
        String s6 = s2 + s3;
        String s7 = new String("疯狂Java");

        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s7);
    }
}
