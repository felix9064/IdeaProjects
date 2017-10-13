package com.felix.crazyjava.item0502;

/**
 * Created with IntelliJ IDEA.
 * Description: 可变参数的方法重载
 * Author: Felix
 * Date: 2017/10/13
 * Time: 9:28
 */
public class OverloadVarargs {

    private void test(String msg) {
        System.out.println("只有一个字符串参数的test方法");
    }

    private void test(String... msg) {
        System.out.println("形参长度可变的test方法");
    }

    public static void main(String[] args) {
        OverloadVarargs olv = new OverloadVarargs();
        // 下面两次调用将执行第二个test方法
        olv.test();
        olv.test("aa", "bb");
        // 下面调用将执行第一个test方法
        olv.test("aa");
        // 下面调用将执行第二个test方法
        olv.test(new String[]{"aa"});
    }
}
