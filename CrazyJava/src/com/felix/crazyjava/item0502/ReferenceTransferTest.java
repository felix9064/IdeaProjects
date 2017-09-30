package com.felix.crazyjava.item0502;

/**
 * Created with IntelliJ IDEA.
 * Description: Java对于引用类型的参数传递，也是采用的是值传递的方式，只不过传递的这个
 *                  值是一个引用，并不是引用所指向的对象
 * Author: Felix
 * Date: 2017/9/29
 * Time: 17:30
 */
public class ReferenceTransferTest {

    public static void swap(DataWrap dw){
        int temp = dw.a;
        dw.a = dw.b;
        dw.b = temp;

        System.out.println("swap方法里，a成员变量的值是：" + dw.a
                + "；b成员变量的值是：" + dw.b);
        dw = null;
    }

    public static void main(String[] args) {
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("交换结束后，a成员变量的值是：" + dw.a
                + "；b成员变量的值是：" + dw.b);
    }
}

class DataWrap{
    int a;
    int b;
}
