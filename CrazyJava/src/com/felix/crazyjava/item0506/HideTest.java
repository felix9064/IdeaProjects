package com.felix.crazyjava.item0506;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2018/1/5
 * Time: 15:50
 */

class Parent {
    public String tag = "你好";
}

class Derived extends Parent {
    private String tag = "一点都不好";
}

public class HideTest {

    public static void main(String[] args) {
        Derived d = new Derived();
        //System.out.println(d.tag);
        System.out.println(((Parent) d).tag);
    }
}
