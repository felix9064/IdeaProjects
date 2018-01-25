package com.felix.crazyjava.item0604;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: final修饰引用类型变量
 * Author: Felix
 * Date: 2018/1/25
 * Time: 11:08
 */
class Person2 {
    private int age;

    public Person2() {}

    public Person2(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class FinalReferenceTest {

    public static void main(String[] args) {
        final int[] arrays = {5, 6, 12, 9};
        System.out.println(Arrays.toString(arrays));
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
        arrays[2] = 1;
        System.out.println(Arrays.toString(arrays));
        // 对引用类型重新赋值是非法的
        // arrays = {1, 2, 3};

        final Person2 p = new Person2(20);
        p.setAge(28);
        System.out.println(p.getAge());
        // 对p引用类型重新赋值，非法
        // p = null;
    }
}
