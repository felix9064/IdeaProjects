package com.felix.crazyjava.item1802;


import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/4/1
 * Time: 10:15
 */
public class ClassLoaderPropTest {

    public static void main(String[] args) throws IOException {
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        System.out.println("系统类加载器：" + cl.toString());

        Enumeration<URL> e = cl.getResources("");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        ClassLoader ext = cl.getParent();
        System.out.println("扩展类加载器：" + ext.toString());
        System.out.println("扩展类加载器的加载路径：" + System.getProperty("java.ext.dirs"));

        System.out.println("扩展类加载器的parent：" + ext.getParent());

    }
}
