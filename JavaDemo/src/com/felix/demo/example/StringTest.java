package com.felix.demo.example;

/**
 * Created with Intellij IDEA.
 * Description
 * Date 2023/5/18 10:04
 *
 * @author Felix
 **/
public class StringTest {

    private static void modifyStr(String str) {
        str += "hahaha";
    }

    private static void modifyStr(StringBuilder sb) {
       sb.append(" hahaha");
    }

    public static void changeNum(Integer integer) {
        integer = 200;
    }

    public static void main(String[] args) {

        String s1 = "zhangsan";
        modifyStr(s1);
        System.out.println(s1);

        StringBuilder sb = new StringBuilder("zhangsan");
        modifyStr(sb);
        System.out.println(sb);

        int i = 1;
        changeNum(i);
        System.out.println(i);

        Integer integer = 2;
        changeNum(integer);
        System.out.println(integer);


    }

}
