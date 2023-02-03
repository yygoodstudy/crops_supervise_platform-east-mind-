package com.example.oop;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * LocalDate工具类测试
 */
public class CalenderTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        System.out.println("年 = " + year);
        System.out.println("月 = " + date.getMonthValue());
        int dayOfMonth = date.getDayOfMonth();
        System.out.println("日 =" + dayOfMonth);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int value = dayOfWeek.getValue();
        System.out.println("today is 星期" + value);

        // 生成10天之后的日期对象
        LocalDate forwardDate = date.plusDays(10); // 生成当前日期后10天的日期对象
        int weekValue = forwardDate.getDayOfWeek().getValue();
        System.out.println("weekValue = " + weekValue);

        LocalDate previousDate = date.minusDays(10); // 生成10天前的日期对象

    }
}
