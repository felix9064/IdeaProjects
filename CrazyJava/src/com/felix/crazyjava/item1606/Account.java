package com.felix.crazyjava.item1606;

/**
 * Created with IntelliJ IDEA.
 * Description: 模拟线程间通讯
 * Author: Felix
 * Date: 2017/3/9
 * Time: 14:13
 */
public class Account {

    // 封装账户编号，账户余额的两个成员变量
    private String accountNo;
    private double balance;

    // 标识账户中是否已有存款的标志
    private boolean flag = false;

    public Account() {
    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * 取钱操作
     * @param drawAmount 取钱金额
     */
    public synchronized void draw(double drawAmount) {
        try {
            // 如果flag为false，表明账户中还没有人存钱进去，取钱方法阻塞
            if (!flag) {
                wait();
            } else {
                System.out.println(Thread.currentThread().getName() + " 取钱：" + drawAmount);
                balance -= drawAmount;
                System.out.println("账户余额为：" + balance);
                // 将标识账户是否已有存款的flag设为false;
                flag = false;
                // 唤醒其他线程
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 存钱操作
     * @param depositAmount 存款金额
     */
    public synchronized void deposit(double depositAmount) {
        try {
            // 如果flag为true，表明账户中已有人存钱进去，存钱方法阻塞
            if (flag) {
                wait();
            } else {
                System.out.println(Thread.currentThread().getName() + " 存款：" + depositAmount);
                balance += depositAmount;
                System.out.println("账户余额为：" + balance);
                // 将标识账户是否已有存款的flag设为false;
                flag = true;
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
}
