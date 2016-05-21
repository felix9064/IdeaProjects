package com.felix.effective.item05.slowversion;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Felix on 2016/5/14.
 * EffectiveJava2 第05条 避免创建不必要的对象
 * 这个是不推荐的版本
 */
public class Person {

    private final Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = new Date(birthDate.getTime());
    }

    /**
     * 该方法是检验一个人是否出生于1946年到1964年期间
     * 该方法每次被调用的时候，都会新建一个Calendar、一个TimeZone和两个Date实例，这是不必要的。
     * @return  true 是；false 否
     */
    public boolean isBabyBoomer() {

        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1964, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = gmtCal.getTime();

        return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
    }

    public static void main(String args[]) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(1990, Calendar.APRIL, 24, 0, 0, 0);

        Person felix = new Person(cal.getTime());
        System.out.println(felix.isBabyBoomer());
    }
}
