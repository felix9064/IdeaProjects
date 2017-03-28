package com.felix.crazyjava.item0604;

/**
 * Created with IntelliJ IDEA.
 * Description: 使用private final修饰的方法在子类中不是重写，只是定义了一个与父类相同的方法而已
 * Author: Felix
 * Date: 2017/3/28
 * Time: 12:12
 */
public class PrivateFinalMethodTest {
    private final void test(){}
}

class Subclass extends PrivateFinalMethodTest{
    // 此处的test方法并不是重写父类的方法，只是定义了一个与父类相同的方法名字而已
    public void test(){}
}
