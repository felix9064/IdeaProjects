package com.felix.demo.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Felix on 2016/6/28.
 */
public class TimeDemo {

    public static void main(String[] args) {

        String date = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);

        System.out.println(date);

    }

}
