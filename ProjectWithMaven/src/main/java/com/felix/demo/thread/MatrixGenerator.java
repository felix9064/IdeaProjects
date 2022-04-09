package com.felix.demo.thread;

import java.util.Random;

/**
 * @created with IntelliJ IDEA.
 * @description: 生成一个随机的二维矩阵
 * @date: 2020-08-27 11:12 星期四
 * @author: Felix
 */
public class MatrixGenerator {

    /**
     * 生成一个随机二维矩阵
     * @param 二维矩阵的行数
     * @param 二维矩阵的列数
     * @return 生成的二维矩阵
     */
    public static double[][] generate (int rows, int columns) {
        double[][] ret = new double[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                ret[i][j] = random.nextDouble()*10;
            }
        }
        return ret;
    }

}
