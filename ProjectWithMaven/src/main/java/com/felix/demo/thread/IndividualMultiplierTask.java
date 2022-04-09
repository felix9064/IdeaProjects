package com.felix.demo.thread;

/**
 * @created with IntelliJ IDEA.
 * @description: 二维矩阵的并发算法版本一
 * @date: 2020-08-28 15:14 星期五
 * @author: Felix
 */
public class IndividualMultiplierTask implements Runnable{

    private final double[][] result;
    private final double[][] matrix1;
    private final double[][] matrix2;

    private final int row;
    private final int columns;

    public IndividualMultiplierTask(double[][] result, double[][] matrix1, double[][] matrix2,
                                    int i, int j) {
        this.result = result;
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.row = i;
        this.columns = j;
    }

    @Override
    public void run() {
        result[row][columns] = 0;
        for (int k = 0; k < matrix1[row].length; k++) {
            result[row][columns] += matrix1[row][k] * matrix2[k][columns];
        }
    }
}
