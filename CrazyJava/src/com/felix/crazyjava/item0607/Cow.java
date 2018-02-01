package com.felix.crazyjava.item0607;

/**
 * Created with IntelliJ IDEA.
 * Description: 定义非静态内部类
 * Author: Felix
 * Date: 2018/1/31
 * Time: 15:14
 */
public class Cow {
    private double weight;

    public Cow(double weight) {
        this.weight = weight;
    }

    public void test() {
        CowLeg cowLeg = new CowLeg(1.12, "黑白相间");
        cowLeg.info();
    }

    private class CowLeg {
        private double length;
        private String color;

        public CowLeg(double length, String color) {
            this.length = length;
            this.color = color;
        }

        public void info() {
            System.out.println("牛腿颜色：" + color + "，高：" + length);
            System.out.println("牛腿所属奶牛的重量：" + weight);
        }
    }

    public static void main(String[] args) {
        Cow cow = new Cow(378.9);
        cow.test();
    }
}
