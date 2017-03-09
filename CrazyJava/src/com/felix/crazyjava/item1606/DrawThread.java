package com.felix.crazyjava.item1606;

/**
 * Created with IntelliJ IDEA.
 * Description: 模拟取钱操作线程
 * Author: Felix
 * Date: 2017/3/9
 * Time: 14:45
 */
public class DrawThread extends Thread {

    private Account account;

    private double drawAmount;

    public DrawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    // 重复100次执行取钱操作
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            account.draw(drawAmount);
        }
    }
}
