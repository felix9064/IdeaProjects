package com.felix.crazyjava.item0603;

/**
 * Created with IntelliJ IDEA.
 * Description: 通过使用静态类方法实现单例模式
 * Author: Felix
 * Date: 2017/3/28
 * Time: 8:41
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}
