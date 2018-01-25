package com.felix.crazyjava.item0605;

/**
 * Created with IntelliJ IDEA.
 * Description: 含有抽象方法的类一定是抽象类，抽象类不能被实例化
 *              子类必须重写父类的所有抽象方法，否则该子类也是抽象类
 * Author: Felix
 * Date: 2017/3/28
 * Time: 16:33
 */
public abstract class Shape {

    {
        System.out.println("执行抽象类Shape的初始化块...");
    }

    private String color;

    public Shape() {
        System.out.println("执行抽象类Shape的无参构造器");
    }

    public Shape(String color) {
        System.out.println("执行抽象类Shape的带参构造器");
        this.color = color;
    }

    // 定义一个计算周长的抽象方法
    public abstract double calPerimeter();

    // 定义一个返回形状的抽象方法
    public abstract String getType();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
