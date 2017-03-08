package com.felix.crazyjava.item1605;

/**
 * Created with IntelliJ IDEA.
 * Description: 测试取钱线程
 * Author: Felix
 * Date: 2017/3/8
 * Time: 13:59
 */
public class DrawTest {
    public static void main(String[] args) {
        // 创建一个账户，余额只有1000元
        Account acct = new Account("6218991234", 1000);

        // 模拟两个线程对同一个账户取钱，各取800
        new DrawThread("张三", acct, 800).start();
        new DrawThread("李四", acct, 800).start();
    }
}
