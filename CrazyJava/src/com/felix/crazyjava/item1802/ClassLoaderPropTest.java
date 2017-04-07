package com.felix.crazyjava.item1802;


import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * Created with IntelliJ IDEA.
 * Description: 类加载器的层级关系。系统类加载器的parent是扩展类加载器
 *              扩展类加载器的parent是null，根类加载器是由jvm实现的
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
        System.out.println("系统类加载器的parent为：" + ext.toString());
        System.out.println("扩展类加载器的加载路径：" + System.getProperty("java.ext.dirs"));

        System.out.println("扩展类加载器的parent为：" + ext.getParent());

    }
}
