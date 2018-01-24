package com.felix.crazyjava.item0601;

/**
 * Created with IntelliJ IDEA.
 * Description: 基本类型变量 和 字符串变量之间的互转
 * Author: Felix
 * Date: 2017/3/16
 * Time: 14:13
 */
public class Primitive2String {

    public static void main(String[] args) {

        String intStr = "123";

        int it1 = Integer.parseInt(intStr);
        int it2 = new Integer(intStr);
        System.out.println(it1 == it2);

        /**
         * 下面两个输出表达式的比较结果之所以不同，是与java的Integer类的设计有关
         * 系统把一个 -128~127之间的整数自动装箱成Integer实例，并放入了一个名为cache的数组中缓存起来
         * 如果以后把一个-128~127之间的整数自动装箱成Integer实例时，实际上是直接指向对应的数组元素
         * 因此-128~127之间的同一个整数自动装箱成Integer实例时，永远都是引用cache数组的同一个数组元素，所以他们是相等的
         * 但是每次把一个不在-128~127范围内的整数自动装箱成Integer实例时，系统总是重新创建一个Integer实例，所以他们不相等
         */
        Integer int1 = 127;
        Integer int2 = 127;
        System.out.println(int1 == int2);

        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
        System.out.println(Integer.compare(a, b));

        System.out.println(Integer.parseUnsignedInt("7FF" , 16));
        System.out.println(Integer.parseUnsignedInt("FFFFFFF6", 16));
    }
}
