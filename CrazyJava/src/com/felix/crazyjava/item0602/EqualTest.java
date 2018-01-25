package com.felix.crazyjava.item0602;

/**
 * Created with IntelliJ IDEA.
 * Description: equal()和==的区别，字符串及基本数据类型比较时用==，对象或引用类型的比较用equal()方法
 * Author: Felix
 * Date: 2017/3/17
 * Time: 15:27
 */
public class EqualTest {

    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("65和65.0f是否相等？" + (it == fl));

        char ch = 'A';
        System.out.println("65和'A'是否相等？" + (it == ch));

        String s1 = "felix";
        String s2 = "felix";
        System.out.println("s1==s2是否相等？" + (s1 == s2));
        System.out.println("s1.equals(s2)是否相等？" + (s1.equals(s2)));

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1==str2是否相等？" + (str1 == str2));
        System.out.println("str1.equals(str2)是否相等？" + (str1.equals(str2)));

    }

}
