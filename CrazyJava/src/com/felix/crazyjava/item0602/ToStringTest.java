package com.felix.crazyjava.item0602;

/**
 * Created with IntelliJ IDEA.
 * Description: 重写Object类的toString()方法
 * Author: Felix
 * Date: 2018/1/24
 * Time: 16:11
 */
class Apple {
    private String color;
    private double weight;

    private Apple() {
    }

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

/*
    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
*/

    @Override
    public String toString() {
        return "一个苹果，颜色是：" + color + "，重量是：" + weight;
    }
}

public class ToStringTest {

    public static void main(String[] args) {
        Apple apple = new Apple("红色", 5.68);
        // 打印Apple对象
        System.out.println(apple);
    }
}
