package com.felix.crazyjava.item0502;

/**
 * Created with IntelliJ IDEA.
 * Description: 一个方法体内调用它自身，被称为方法递归
 * Author: Felix
 * Date: 2017/9/30
 * Time: 9:14
 */
public class Recursive {

    private static int fn(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * fn(n - 1) + fn(n - 2);
        }
    }

    private static int fn2(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return fn2(n + 2) - 2 * fn(n + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fn(10));
        System.out.println(fn2(10));
    }
}
