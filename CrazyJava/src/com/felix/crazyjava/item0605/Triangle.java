package com.felix.crazyjava.item0605;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/3/28
 * Time: 16:37
 */
public class Triangle extends Shape {

    // 定义三角形的3边
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        // super(color);
        setColor(color);
        this.setSides(a, b, c);
    }

    public void setSides(double a, double b, double c) {
        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("三角形任意两边之和必须大于第三边");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * 重写Shape类的计算周长的抽象方法
     * @return 三角形周长
     */
    @Override
    public double calPerimeter() {
        return a + b + c;
    }

    /**
     * 重写Shape类的返回形状的抽象方法
     * @return 三角形
     */
    @Override
    public String getType() {
        return "三角形";
    }
}
