package com.example.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yuanyao
 * @Date 2022/11/10
 */
public class Demo2 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("����ҹɫ�µ�С�����ܣ������������Ļ�Ұ");
        list.add(new Object());
        System.out.println(list); // ���ᱨ��

        for (Object o : list) {
            String s = (String) o;
            System.out.println(s); // �ᱨ��java.lang.Object cannot be cast to java.lang.String
        }
    }
}
