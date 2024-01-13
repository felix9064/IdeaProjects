package com.felix.demo.example;

/**
 * Created with Intellij IDEA.
 * Description:
 * Date: 2022/11/29 14:19
 * @author Felix
 **/
public class StringUtils {


    public static void main(String[] args) {
        String str = "2321db1";

        System.out.println(str.substring(str.length()-1));
        System.out.println(str.substring(0, 4));

        String accName = "上来说的221浮动空间";

        System.out.println(accName.length());
        System.out.println(accName.substring(0,6));

        String s1 = "202311011000012454887";
        System.out.println(removeLeftChar(s1));

    }

    public static String removeLeftChar(String source) {
        return source.substring(8).replaceAll("^0+", "");
    }
}
