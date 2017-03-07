package com.felix.demo.example;

/**
 * Created by Felix on 2016/7/19.
 */
public class SumInteger {
    public static void main(String[] args) {
        long sum = 0L;
        for(long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
