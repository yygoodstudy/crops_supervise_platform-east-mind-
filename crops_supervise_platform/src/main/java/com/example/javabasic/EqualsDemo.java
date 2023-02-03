package com.example.javabasic;

import cn.hutool.core.lang.Console;
import javafx.scene.control.Alert;

/**
 * @Author yuanyao
 * @Date 2023/1/30
 */
public class EqualsDemo {
    public static void main(String[] args) {
//        String a = "Monday";
//        String b = "Monday";
//        String c = new String(b);
//        String d = new String("Monday");
//        System.out.println(a == b); // == :比较引用数据类型，比较的是其在内存中的地址
//        System.out.println(a == c);
//        System.out.println(b == d);
        String a = new String("abc");
        String b = new String("abc");
        boolean bool = a == b;
        System.out.println("bool = " + bool);
        boolean equals = a.equals(b);
        System.out.println("equals = " + equals);

    }

    private static void method() {
        System.out.println("hello world");
        Console.log("sdf");
    }
}
