package com.felix.crazyjava.item1606;

/**
 * Created with IntelliJ IDEA.
 * Description: 模拟存钱操作线程
 * Author: Felix
 * Date: 2017/3/9
 * Time: 14:49
 */
public class DepositThread extends Thread {

    private Account account;

    private double depositAmount;

    public DepositThread(String name, Account account, double depositAmount) {
        super(name);
        this.account = account;
        this.depositAmount = depositAmount;
    }

    // 重复100次执行存钱操作
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            account.deposit(depositAmount);
        }
    }
}
