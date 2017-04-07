package com.felix.crazyjava.item1802;

import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description: 获取System类的所有properties
 * Author: Felix
 * Date: 2017/4/7
 * Time: 9:12
 */
public class SystemProperties {

    public static void main(String[] args) {

        Set<Map.Entry<Object, Object>> set = System.getProperties().entrySet();
        for (Map.Entry<Object, Object> map : set) {
            System.out.println(map.getKey() + "=" + map.getValue());
        }
    }
}
