package com.felix.crazyjava.item1803;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description: 通过反射来获取对应类的相关信息，如获取对应类的方法，成员变量，构造函数，注解等
 * Author: Felix
 * Date: 2017/4/8
 * Time: 15:36
 */
@Repeatable(Annos.class)
@interface Anno {}
@Retention(value = RetentionPolicy.RUNTIME)
@interface Annos {
    Anno[] value();
}
@SuppressWarnings(value = "unchecked")
@Deprecated
@Anno
@Anno
public class ClassTest {

    private ClassTest() {

    }

    public ClassTest(String name) {
        System.out.println("执行有参数的构造器，参数为：" + name);
    }

    public void info(String str) {
        System.out.println("执行有参数的方法，参数为：" + str);
    }

    // 测试用内部类
    class Inner {

    }

    public static void main(String[] args) throws Exception {
        Class<ClassTest> clazz = ClassTest.class;

        // 获取该Class对应类的所有构造器，与构造器的访问权限无关
        Constructor[] ctors = clazz.getDeclaredConstructors();
        System.out.println("ClassTest类的所有构造器如下：");
        for (Constructor c : ctors) {
            System.out.println(c.toString());
        }

        // 获取该Class对应类的所有的public构造器
        ctors = clazz.getConstructors();
        System.out.println("ClassTest类的全部public构造器如下：");
        for (Constructor c : ctors) {
            System.out.println(c.toString());
        }

        // 获取ClassTest对应类的全部public方法
        Method[] mtds = clazz.getMethods();
        System.out.println("ClassTest类的全部public方法如下：");
        for (Method m : mtds) {
            System.out.println(m.toString());
        }

        // 获取该Class对应类的带指定参数列表的构造器
        Constructor constructor = clazz.getConstructor(String.class);
        Object obj = constructor.newInstance("felix");

        // 获取ClassTest对应类的带指定参数列表的方法
        Method method = clazz.getMethod("info", String.class);
        // 调用该方法
        method.invoke(obj, "hello");

        // 获取该Class对象所对应类的全部注解
        Annotation[] anns = clazz.getAnnotations();
        System.out.println("ClassTest的全部注解如下：");
        for (Annotation a : anns ) {
            System.out.println(a.toString());
        }

        Class[] innerClass = clazz.getDeclaredClasses();
        System.out.println("该Class对象所对应的类的全部内部类如下：");
        for (Class inner : innerClass) {
            System.out.println(inner.toString());
        }

        Class inClazz = Class.forName("com.felix.crazyjava.item1803.ClassTest$Inner");
        System.out.println("inClazz对应类的外部类为：" + inClazz.getDeclaringClass().toString());

        System.out.println("ClassTest类对应的包为：" + clazz.getPackage());
        System.out.println("ClassTest类对应的父类为：" + clazz.getSuperclass());
    }

}
