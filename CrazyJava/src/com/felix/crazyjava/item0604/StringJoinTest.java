package com.felix.crazyjava.item0604;

/**
 * Created with IntelliJ IDEA.
 * Description: 字符串缓冲池
 * Author: Felix
 * Date: 2017/3/28
 * Time: 11:55
 */
public class StringJoinTest {

    public static void main(String[] args) {
        String s1 = "疯狂Java";
        String s2 = "疯狂" + "Java";

        System.out.println(s1.equals(s2));

        String str1 = "疯狂";
        String str2 = "Java";
        String s3 = str1 + str2;

        System.out.println(s1 == s3);

    }

}
