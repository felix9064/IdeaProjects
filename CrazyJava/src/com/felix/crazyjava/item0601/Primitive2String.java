package com.felix.crazyjava.item0601;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Felix
 * Date: 2017/3/16
 * Time: 14:13
 */
public class Primitive2String {

    public static void main(String[] args) {
        String intStr = "123";

        int it1 = Integer.parseInt(intStr);
        int it2 = new Integer(intStr);


        Integer biga = 120;
        Integer bigb = 120;

        System.out.println(biga==bigb);



    }
}
