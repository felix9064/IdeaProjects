package com.felix.crazyjava.item1606;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/3/9
 * Time: 14:53
 */
public class DrawTest {

    public static void main(String[] args) {
        // 创建一个账户
        Account account = new Account("01320101001000078", 0);
        new DrawThread("取钱者", account, 800).start();
        new DepositThread("存钱者甲", account, 800).start();
        new DepositThread("存钱者乙", account, 800).start();
        new DepositThread("存钱者丙", account, 800).start();
    }
}
