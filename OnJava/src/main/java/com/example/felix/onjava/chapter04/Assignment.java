package com.example.felix.onjava.chapter04;

import lombok.Data;

/**
 * OnJava书中第4章示例代码. 演示Java中对象的赋值其实操作的是对象的引用
 * @author Felix
 * @date 2024/1/31 16:32
 **/
public class Assignment {

    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();

        t1.setLevel(9);
        t2.setLevel(47);
        System.out.println(t1.equals(t2));
        // 分别输出t1和t2的level
        System.out.println("1: t1.level: " + t1.getLevel() + ", t2.level: " + t2.getLevel());

        // 将对象t2赋值给对象t1，此时t1和t2指向的是同一个对象，原来t1指向的对象没有被引用，会被垃圾回收器进行回收
        t1 = t2;
        // 分别输出t1和t2的level
        System.out.println("2: t1.level: " + t1.getLevel() + ", t2.level: " + t2.getLevel());

        // 将对象t1的level修改为22，由于t1和t2指向的是同一个对象，所以t2的level也是22
        t1.setLevel(22);
        // 分别输出t1和t2的level
        System.out.println("3: t1.level: " + t1.getLevel() + ", t2.level: " + t2.getLevel());
    }
}

@Data
class Tank {
    private int level;
}
