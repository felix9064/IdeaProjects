package com.felix.demo.reference;

public class Test {

    static void modify(StringBuilder sb) {
        // 修改对象的状态
        sb.append(" modified.");
        // 改变引用的值，但这不会影响原始的引用
        sb = new StringBuilder("new String");
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("original");
        System.out.println("Before: " + sb);

        modify(sb);

        // 此处输出的是 After: original modified.
        System.out.println("After: " + sb);
    }

}
