package com.example.annotation;

/**
 * @Author yuanyao
 * @Date 2022/11/10
 */
public @interface MyAnno {

    int age(); // 基本数据类型

    boolean sex() default false;

    String value(); // 字符串

    String[] names(); // 字符串数组

    Season season() default Season.WINTER; // 枚举

    NotNull notnull() default @NotNull(message = "aaa"); // 注解
}
