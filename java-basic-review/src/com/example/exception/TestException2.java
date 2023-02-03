package com.example.exception;

import java.sql.Time;
import java.util.Date;

/**
 * @Author yuanyao
 * @Date 2023/1/15
 */
public class TestException2 {
    public static void main(String[] args) {
        // 1.Exception in thread "main" java.lang.StackOverflowError：栈溢出
//        main(args);
//        int size = 1024 * 1024 * 1024;
//        System.out.println(size);

        // 2.Exception in thread "main" java.lang.OutOfMemoryError: Java heap space：堆空间不足
//        Integer[] integers = new Integer[size];

        String s = "123";
        s = "abc";
        int number = Integer.parseInt(s); // java.lang.NumberFormatException: 数字格式化异常
        System.out.println("number = " + number);

//        Object date = new Date();
//        String date11 = (String) date; // java.lang.ClassCastException:类型转换异常
    }
}
