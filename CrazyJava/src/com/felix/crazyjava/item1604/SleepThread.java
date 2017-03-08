package com.felix.crazyjava.item1604;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description: 线程休眠sleep()方法
 * Author: Felix
 * Date: 2017/3/8
 * Time: 10:46
 */
public class SleepThread {

    public static void main(String[] args) throws Exception{
        for (int i = 0; i < 10; i++) {
            System.out.println("当前时间：" + new Date());
            Thread.sleep(1000);
        }
    }

}
