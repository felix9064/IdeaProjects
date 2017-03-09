package com.felix.crazyjava.item1605;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * Description: 对线程对象加锁
 * Author: Felix
 * Date: 2017/3/9
 * Time: 12:44
 */
public class LockThread {

    // 定义锁对象
    private final ReentrantLock lock = new ReentrantLock();

    public void method() {
        // 加锁
        lock.lock();

        try {
            // 需要保证线程安全的代码
            // ... method body
        }
        // 使用finally 块来保证释放锁
        finally {
            lock.unlock();
        }
    }

}
