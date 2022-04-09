package com.felix.crazyjava.item1803;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description: 测试利用反射是否能调用私有的构造器来创建实例
 * Author: Felix
 * Date: 2017/4/8
 * Time: 17:17
 */
public class PersonTest {

    public static void main(String[] args) throws Exception {

        Class clazz = Person.class;

        // 此处是获取Person类的public修饰的带指定参数的构造器，第一个参数是String类型，第二个参数是int型
        // 而对应的在Person类中满足该条件的构造函数是private修饰的，故此处会抛出没有此方法异常
        // Constructor c1 = clazz.getConstructor(String.class, int.class);

        // 此处是获取Person类的带指定参数的构造器，与访问权限无关，如果是private修饰的，则会抛出非法访问异常
        Constructor c1 = clazz.getDeclaredConstructor(String.class, int.class);

        Object o1 = c1.newInstance("Felix", 27);

        Method method = clazz.getMethod("setName", String.class);
        method.invoke(o1, "Fuck");

        Method method1 = clazz.getMethod("getName");
        System.out.println(method1.invoke(o1).toString());
    }

}
