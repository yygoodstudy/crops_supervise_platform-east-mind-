package com.example.genericity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author yuanyao
 * @Date 2022/11/10
 */
public class Demo1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // ָ���ܹ���ŵ��������� ͳһ���ͷ�ֹ���� ����ת���쳣
        List<String> str = new ArrayList<>();
        str.add("1");
        str.add("hello");
        str.add("ZHANGJIE");
        for (Object string : str) {
            String s = (String) string;
            System.out.print(s + "\t");
        }

        Class<? extends List> aClass = str.getClass();
        Method add = aClass.getDeclaredMethod("add", Object.class);
        add.invoke(str, "����������");
        add.invoke(str, new Object());

        for (Object s : str) {
            System.out.println(s);
        }
    }
}
