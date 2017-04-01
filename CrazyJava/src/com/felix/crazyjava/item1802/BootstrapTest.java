package com.felix.crazyjava.item1802;

import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * Description: Bootstrap类加载器负责加载Java的核心类
 * Author: Felix
 * Date: 2017/4/1
 * Time: 9:50
 */
public class BootstrapTest {

    public static void main(String[] args) {

        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));

        /*
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url: urls) {
            System.out.println(url.toExternalForm());
        }*/

    }

}
