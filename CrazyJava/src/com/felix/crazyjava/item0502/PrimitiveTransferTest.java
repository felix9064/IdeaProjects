package com.felix.crazyjava.item0502;

/**
 * Created with IntelliJ IDEA.
 * Description: Java方法的参数传递是通过值传递进行的，所谓值传递，就是将实际参数的复本（复制品）传入方法内，
 *                  而参数本身并不会受到影响
 * Author: Felix
 * Date: 2017/9/30
 * Time: 8:41
 */
public class PrimitiveTransferTest {

    private static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swap方法里，变量a的值是：" + a
                + "；变量b的值是：" + b);
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        swap(a, b);
        System.out.println("交换结束后，变量a的值是：" + a
                + "；变量b的值是：" + b);

    }
}
