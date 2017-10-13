package com.felix.crazyjava.item0502;

/**
 * Created with IntelliJ IDEA.
 * Description: 可变参数，在方法的最后一个参数的类型后增加三个点(...)，则表明该形参可以接受多个参数，
 *                  多个参数值被当成数组传入
 * Author: Felix
 * Date: 2017/9/30
 * Time: 8:58
 */
public class Varargs {
    // 定义了形参个数可变的方法
    private static void test(int a, String... books){
        // books被当成数组处理
        for (String book: books) {
            System.out.println(book);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        // 调用 test 方法
        test(5, "疯狂Java讲义", "疯狂Android讲义", "疯狂Ajax讲义");
    }
}
