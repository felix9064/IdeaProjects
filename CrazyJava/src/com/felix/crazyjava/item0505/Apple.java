package com.felix.crazyjava.item0505;

/**
 * Created with IntelliJ IDEA.
 * Description: 构造器重载
 * Author: Felix
 * Date: 2017/12/15
 * Time: 8:56
 */
public class Apple {

    public String name;
    public String color;
    public double weight;

    public Apple(){}

    public Apple(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Apple(String name, String color, double weight) {
        // 通过this调用另一个重载的构造器的初始化代码块
        this(name, color);
        this.weight = weight;
    }
}
