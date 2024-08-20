package com.felix.demo.example;

/**
 * Java的try-catch-finally 中，如果 catch 中 return 了，finally 还会执行，但是不会改变try或catch块中的return的值。
 */
public class TestFinally {

    public static void main(String[] args) {
        System.out.println("testMethod() return : " + testMethod());
    }

    public static int testMethod() {
        int result = 0;

        try {
            result = 10 / 0;
            return result;
        } catch (ArithmeticException e) {
            result = -1;
            System.out.println("Catch ArithmeticException in catch block.");
            return result;
        } finally {
            result = 100;
            System.out.println("Executing finally block.");
        }
    }


}
