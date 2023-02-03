package com.example.annotation;

/**
 * @Author yuanyao
 * @Date 2022/11/10
 */
public @interface MyAnno {

    int age(); // ������������

    boolean sex() default false;

    String value(); // �ַ���

    String[] names(); // �ַ�������

    Season season() default Season.WINTER; // ö��

    NotNull notnull() default @NotNull(message = "aaa"); // ע��
}
