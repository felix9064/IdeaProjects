package com.felix.crazyjava.item1605;

/**
 * Created with IntelliJ IDEA.
 * Description: 模拟取钱的线程类
 * Author: Felix
 * Date: 2017/3/8
 * Time: 13:31
 */
public class DrawThread extends Thread {

    // 模拟用户账户
    private Account account;

    // 当前取钱线程所希望取的金额；
    private double drawAmount;

    DrawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    // 当多个线程修改同一个共享数据时，将涉及数据安全问题
    @Override
    public void run() {
        // 直接调用account对象的draw()方法来执行取钱操作
        // 同步方法的同步监视器是this，this代表调用draw()方法的对象
        account.draw(drawAmount);

        /*
        // 使用account对象作为同步监视器，任何线程进入下面同步代码块之前
        // 必须先获得对account账户的锁定，其他线程无法获得锁，也就无法修改它
        // 这种做法符合： 加锁-修改-释放锁 的逻辑
        synchronized (account) {
            // 账户余额大于要取的金额时
            if (account.getBalance() >= drawAmount) {
                // 吐出钞票
                System.out.println(getName() + "取钱成功！吐出钞票： " + drawAmount);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 修改账户余额
                account.setBalance(account.getBalance() - drawAmount);
                System.out.println("\t 余额为：" + account.getBalance());
            } else {
                System.out.println(getName() + "取钱失败！余额不足！");
            }
        }
        */
    }
}
