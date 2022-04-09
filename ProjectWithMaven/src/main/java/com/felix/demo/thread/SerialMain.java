package com.felix.demo.thread;

import java.util.Date;

/**
 * @created with IntelliJ IDEA.
 * @description: 测试矩阵乘法串行版本的效率
 * @date: 2020-08-27 11:37 星期四
 * @author: Felix
 */
public class SerialMain {

    public static void main(String[] args) {
        double matrix1[][] = MatrixGenerator.generate(2000, 2000);
        double matrix2[][] = MatrixGenerator.generate(2000, 2000);
        double resultSerial[][] = new double[matrix1.length][matrix2[0].length];

        Date start = new Date();
        SerialMultiplier.multiply(matrix1, matrix2, resultSerial);
        Date end = new Date();
        System.out.printf("Serial：%d%n", end.getTime() - start.getTime());
    }

}
