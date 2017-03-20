package com.felix.crazyjava.item0601;

/**
 * Created with IntelliJ IDEA.
 * Description: 自动装箱和拆箱
 * Author: Felix
 * Date: 2017/3/20
 * Time: 12:29
 */
public class AutoBoxingUnboxing {

    public static void main(String[] args) {

        // 直接把一个基本类型变量赋给Integer对象
        Integer inObj = 5;

        // 直接把一个boolean类型变量赋给Object对象
        Object boolObj = true;

        // 直接把一个Integer对象赋给int类型的变量
        int it = inObj;

        if (boolObj instanceof Boolean) {
            // 将Object类型对象强转为Boolean类型，再赋给boolean类型
            boolean b = (Boolean) boolObj;
            System.out.println(b);
        }


    }

}
