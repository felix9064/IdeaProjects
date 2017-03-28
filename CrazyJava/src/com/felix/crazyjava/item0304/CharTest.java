package com.felix.crazyjava.item0304;

/**
 * Created with IntelliJ IDEA.
 * Description: 字符类型表示方法
 * Author: Felix
 * Date: 2017/3/21
 * Time: 16:07
 */
public class CharTest {

    public static void main(String[] args) {
        // 直接使用Unicode编码值来指定字符值
        char ch = '\u9999';
        System.out.println(ch);

        // 直接将char类型变量当作int类型变量使用
        char zhong = '疯';
        int zhongValue = zhong;
        System.out.println(zhongValue);

        char c = 97;
        System.out.println(c);
    }

}
