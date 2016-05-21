package com.felix.effective.item05.fastversion;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Felix on 2016/5/14.
 */
public class Person {
    private final Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = new Date(birthDate.getTime());
    }

    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = gmtCal.getTime();
        gmtCal.set(1964, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = gmtCal.getTime();
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
    }

    public static void main(String args[]) {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(1960, Calendar.APRIL, 24, 0, 0, 0);

        Person felix = new Person(cal.getTime());
        System.out.println(felix.isBabyBoomer());
    }
}
