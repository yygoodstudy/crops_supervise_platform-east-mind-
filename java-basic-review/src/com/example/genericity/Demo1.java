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
        // 指定能够存放的数据类型 统一类型防止出现 类型转换异常
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
        add.invoke(str, "美丽新世界");
        add.invoke(str, new Object());

        for (Object s : str) {
            System.out.println(s);
        }
    }
}
