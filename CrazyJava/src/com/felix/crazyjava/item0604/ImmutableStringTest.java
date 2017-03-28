package com.felix.crazyjava.item0604;

/**
 * Created with IntelliJ IDEA.
 * Description: 不可变类创建实例后，该实例的实例变量不可改变
 * Author: Felix
 * Date: 2017/3/28
 * Time: 12:47
 */
public class ImmutableStringTest {

    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }

}
