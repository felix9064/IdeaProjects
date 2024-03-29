package com.felix.demo.example;

/**
 * 打印99乘法表
 * @author Felix
 * @date 2024/1/13 16:45
 **/
public class MultiplicationTable {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }

}
