package com.felix.crazyjava.item0506;

/**
 * Created with IntelliJ IDEA.
 * Description: 重写父类的方法
 * Author: Felix
 * Date: 2018/1/5
 * Time: 15:08
 */
public class Bird {
    public void fly() {
        System.out.println("我在天空里自由自在地飞翔");
    }
}

class Ostrich extends Bird {

    // 重写父类的fly方法
    @Override
    public void fly() {
        System.out.println("我只能在地上奔跑");
    }

    public static void main(String[] args) {
        Bird b = new Ostrich();
        b.fly();
    }
}
