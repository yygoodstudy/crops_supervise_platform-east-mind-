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
        list.add("江南夜色下的小桥屋檐，读不懂塞北的荒野");
        list.add(new Object());
        System.out.println(list); // 不会报错

        for (Object o : list) {
            String s = (String) o;
            System.out.println(s); // 会报错，java.lang.Object cannot be cast to java.lang.String
        }
    }
}
