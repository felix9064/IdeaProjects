package com.felix.crazyjava.item1801;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/4/1
 * Time: 9:21
 */
public class ClassLoaderTest {

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        cl.loadClass("com.felix.crazyjava.item1801.Tester");

        System.out.println("系统加载Tester类");
        Class.forName("com.felix.crazyjava.item1801.Tester");
    }

}

class Tester {

    static {
        System.out.println("Tester类的静态初始化块");
    }
}
