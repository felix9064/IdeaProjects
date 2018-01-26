package com.felix.crazyjava.item0606;

/**
 * Created with IntelliJ IDEA.
 * Description: 接口定义
 * Author: Felix
 * Date: 2018/1/26
 * Time: 11:07
 */
public interface Output {

    // 接口里定义的成员变量只能是常量，系统会自动在前面加上public static final修饰符
    int MAX_CACHE_LINE = 50;

    // 接口里定义的普通方法只能是抽象方法，不能有方法体，系统会自动在前面加上public abstract修饰符
    void out();
    void getDate(String msg);

    // 接口里定义的默认方法，需要用default修饰，为Java8新特性，有方法体，系统会默认在前面加上public修饰符
    default void print(String... msgs){
        for (String msg : msgs) {
            System.out.println(msg);
        }
    }

    public default void test() {
        System.out.println("默认的test方法");
    }

    // 在接口中定义类方法，需要使用static修饰，Java8新特性，有方法体
    static String staticTest() {
        return "接口里的类方法";
    }
}
