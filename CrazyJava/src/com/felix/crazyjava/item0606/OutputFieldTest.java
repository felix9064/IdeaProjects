package com.felix.crazyjava.item0606;

/**
 * Created with IntelliJ IDEA.
 * Description: 通过接口来访问接口里面的成员变量
 * Author: Felix
 * Date: 2018/1/26
 * Time: 13:56
 */
public class OutputFieldTest {
    public static void main(String[] args) {
        System.out.println(Output.MAX_CACHE_LINE);
        // Output.MAX_CACHE_LINE = 20;
        // 使用接口调用类方法
        System.out.println(Output.staticTest());
    }
}
