package com.felix.crazyjava.item0604;

/**
 * Created with IntelliJ IDEA.
 * Description: 测试Integer类的缓存
 * Author: Felix
 * Date: 2018/1/25
 * Time: 15:20
 */
public class IntegerCacheTest {

    public static void main(String[] args) {

        // 创建新的Integer对象
        Integer int1 = new Integer(6);

        // 第一次调用valueOf方法，会先执行Integer类的静态内部类IntegerCache，
        // 该内部类会创建一个-128到127的缓存数组，该方法返回的是缓存的数据
        Integer int2 = Integer.valueOf(6);

        // 这里回直接返回缓存数组中的数据
        Integer int3 = Integer.valueOf(6);

        // 这里的200超过了缓存的数组范围，故每次都是创建新的Integer对象
        Integer int4 = Integer.valueOf(200);
        Integer int5 = Integer.valueOf(200);

        System.out.println(int1 == int2);
        System.out.println(int2 == int3);
        System.out.println(int4 == int5);

    }
}
