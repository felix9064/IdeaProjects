package com.felix.crazyjava.item1801;

/**
 * Created with IntelliJ IDEA.
 * Description: final修饰的类变量如果在编译时就能确定它的值，
 *              那么编译时会在所有使用该变量的地方都会替换成它的值，称为宏替换
 * Author: Felix
 * Date: 2017/4/1
 * Time: 9:10
 */
public class CompileConstantTest {
    public static void main(String[] args) {
        // 此处虽然访问了MyTest类的类变量，但是并不会导致MyTest类的静态初始化块被执行
        // 因为编译时MyTest的类变量的值已经确定，故此处会使用宏替换，在编译时会被替换成类变量的值
        System.out.println(MyTest.CONSTANT);
    }
}

class MyTest {

    static {
        System.out.println("静态初始化块...");
    }

    public static final String CONSTANT = "疯狂Java讲义";
}
