package com.example.javabasic;

import java.util.ArrayList;

/**
 * @Author yuanyao
 * @Date 2022/12/28
 */
public class TestStream3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("linqingxia");
        list.add("zhangmanyu");
        list.add("wangzuxian");
        list.add("liuyan");
        list.add("zhangmin");
        list.add("zhangwuji");

        list.stream().sorted().forEach(System.out::println);
        System.out.println("****************************");
        list.stream().sorted((x, y) -> {
            int num = x.length() - y.length();
            return num == 0 ? x.compareTo(y) : num;
        }).forEach(System.out::println);
    }
}
