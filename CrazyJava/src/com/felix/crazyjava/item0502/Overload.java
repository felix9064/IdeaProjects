package com.felix.crazyjava.item0502;

/**
 * Created with IntelliJ IDEA.
 * Description: 方法重载
 * Author: Felix
 * Date: 2017/9/30
 * Time: 9:33
 */
public class Overload {

    private void test() {
        System.out.println("无参数test方法");
    }

    private void test(String msg) {
        System.out.println("重载的test方法，参数：" + msg);
    }

    public static void main(String[] args) {
        Overload ol = new Overload();
        ol.test();
        ol.test("Hello");
    }
}
