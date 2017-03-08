package com.felix.crazyjava.item1605;

/**
 * Created with IntelliJ IDEA.
 * Description: 通过一个取钱的操作来模拟线程安全问题，账户实体类
 * Author: Felix
 * Date: 2017/3/8
 * Time: 13:24
 */
public class Account {

    private String accountNo;
    private double balance;

    public Account() {
    }

    Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        return accountNo.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj != null && obj.getClass() == Account.class) {
            Account target = (Account) obj;
            return target.getAccountNo().equals(accountNo);
        }

        return false;
    }

    // 提供一个线程安全的draw()方法来完成取钱操作
    public synchronized void draw(double drawAmount) {
        // 账户余额大于要取的金额时
        if (balance >= drawAmount) {
            // 吐出钞票
            System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票： " + drawAmount);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 修改账户余额
            balance -= drawAmount;
            System.out.println("\t 余额为：" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + "取钱失败！余额不足！");
        }
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }
}
