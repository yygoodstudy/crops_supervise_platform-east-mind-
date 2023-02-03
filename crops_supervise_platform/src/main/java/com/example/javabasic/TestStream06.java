package com.example.javabasic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author yuanyao
 * @Date 2022/12/28
 */
public class TestStream06 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");

        List<String> collect = list.stream().filter(x -> x.length() == 3).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
