package com.felix.crazyjava.item0506;

/**
 * Created with IntelliJ IDEA.
 * Description: 子类构造器通过super关键字可以调用父类构造器代码
 * Author: Felix
 * Date: 2018/1/5
 * Time: 15:56
 */

class Base {
    public double size;
    public String name;
    public Base(double size, String name) {
        this.size = size;
        this.name = name;
    }
}

public class Sub extends Base {
    public String color;
    public Sub(double size, String name, String color) {
        super(size, name);
        this.color = color;
    }

    public static void main(String[] args) {
        Sub s = new Sub(5.6, "测试对象", "红色");
        System.out.println(s.size + "--" + s.name + "--" + s.color);
    }
}
