package com.felix.crazyjava.item0607;

/**
 * Created with IntelliJ IDEA.
 * Description: 非静态内部类的成员可以直接访问外部类的private成员变量，
 *              如果变量名相同，则根据变量位置的不同，访问的方式也不同
 * Author: Felix
 * Date: 2018/1/31
 * Time: 15:34
 */
public class DiscernVariable {
    private String prop = "外部类的实例变量";

    private class InClass {
        private String prop = "内部类的实例变量";

        public void info () {
            String prop = "局部变量";
            System.out.println("外部类的实例变量值：" + DiscernVariable.this.prop);
            System.out.println("内部类的实例变量值：" + this.prop);
            System.out.println("局部变量的值：" + prop);
        }
    }

    public void test() {
        InClass inClass = new InClass();
        inClass.info();
    }

    public static void main(String[] args) {
        new DiscernVariable().test();
    }
}

