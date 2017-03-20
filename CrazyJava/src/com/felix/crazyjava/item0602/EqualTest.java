package com.felix.crazyjava.item0602;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/3/17
 * Time: 15:27
 */
public class EqualTest {

    public static void main(String[] args) {
        int it = 65;

        float fl = 65.0f;

        System.out.println("65和65.0f是否相等？" + (it == fl));

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("str1和str2是否相等？" + (str1 == str2));
        System.out.println("str1和str2是否相等？" + (str1.equals(str2)));

    }

}
