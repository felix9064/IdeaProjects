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

        Constructor c1 = clazz.getConstructor(String.class, int.class);
        Object o1 = c1.newInstance("Felix", 27);
        Method method = clazz.getMethod("setName", String.class);
        method.invoke(o1, "Fuck");

        Method method1 = clazz.getMethod("getName");
        System.out.println(method1.invoke(o1).toString());

    }

}
