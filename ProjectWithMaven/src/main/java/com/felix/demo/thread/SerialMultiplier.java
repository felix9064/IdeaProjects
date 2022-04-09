package com.felix.demo.thread;

/**
 * @created with IntelliJ IDEA.
 * @description: 二维矩阵乘法的串行版本
 * @date: 2020-08-27 11:18 星期四
 * @author: Felix
 */
public class SerialMultiplier {

    public static void multiply (double[][] matrix1, double[][] matrix2, double[][] result) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int columns2 = matrix2[0].length;

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    }

}
