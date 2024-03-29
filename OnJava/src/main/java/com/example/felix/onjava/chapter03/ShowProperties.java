package com.example.felix.onjava.chapter03;

/**
 * OnJava书中第3章示例代码
 * @author Felix
 * @date 2024/1/31 15:40
 **/
public class ShowProperties {

    public static void main(String[] args) {
        // 打印所有系统属性
        System.getProperties().list(System.out);

        // 打印系统用户名
        System.out.println(System.getProperty("user.name"));
        // 打印环境变量path
        System.out.println(System.getProperty("java.library.path"));
    }
}
