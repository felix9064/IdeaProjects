package com.felix.crazyjava.item1802;

/**
 * Created with IntelliJ IDEA.
 * Description: 提供给CompileClassLoader进行加载的类
 * Author: Felix
 * Date: 2017/4/1
 * Time: 15:24
 */
public class Hello {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("运行Hello的参数：" + arg);
        }
    }
}
