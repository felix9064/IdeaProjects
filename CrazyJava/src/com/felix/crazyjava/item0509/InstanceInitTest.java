package com.felix.crazyjava.item0509;

/**
 * Created with IntelliJ IDEA.
 * Description: 初始化代码块
 * Author: Felix
 * Date: 2018/1/19
 * Time: 15:59
 */
public class InstanceInitTest {

    {
        a = 6;
    }
    int a = 9;

    public static void main(String[] args) {
        System.out.println(new InstanceInitTest().a);
    }
}
