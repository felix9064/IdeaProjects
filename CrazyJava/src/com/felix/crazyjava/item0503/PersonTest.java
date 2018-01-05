package com.felix.crazyjava.item0503;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/10/13
 * Time: 11:00
 */
public class PersonTest {

    public static void main(String[] args) {
        System.out.println("Person的eyeNum类变量的值：" + Person.eyeNum);
        Person p = new Person();
        System.out.println("p对象的name变量的值是：" + p.name + " p对象的eyeNum变量值是：" + p.eyeNum);

        p.name = "孙悟空";
        p.eyeNum = 2;

        System.out.println("");
    }

}

class Person {
    // 定义一个实例变量
    public String name;
    // 定义一个类变量
    public static int eyeNum;
}