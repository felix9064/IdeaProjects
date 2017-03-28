package com.felix.crazyjava.item0604;

/**
 * Created with IntelliJ IDEA.
 * Description: final修饰的方法不可以被子类重写
 * Author: Felix
 * Date: 2017/3/28
 * Time: 12:07
 */
public class FinalMethodTest {

    public final void test(){

    }
}

class Sub extends FinalMethodTest{
    // public void test(){}
}
