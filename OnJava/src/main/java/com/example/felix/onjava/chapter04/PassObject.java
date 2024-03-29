package com.example.felix.onjava.chapter04;

import lombok.Data;

/**
 * OnJava书中第4章示例代码. 演示给方法传递对象，其实传递的是对象的引用
 * @author Felix
 * @date 2024/1/31 16:59
 **/
public class PassObject {

    static void f(Letter y) {
        y.setC('z');
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.setC('a');

        System.out.println("1: x.c: " + x.getC());
        f(x);
        System.out.println("2: x.c: " + x.getC());
    }

}

@Data
class Letter {
    private char c;
}
