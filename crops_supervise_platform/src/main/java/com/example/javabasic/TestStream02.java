package com.example.javabasic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author yuanyao
 * @Date 2022/12/28
 */
public class TestStream02 {
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        List<String> list = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");
        list.add("柳岩");
        list.add("张无忌");

        // 取集合的前4个元素
        Stream<String> s1 = list.stream().limit(4);
        // 跳过前2个元素取后边的元素
        Stream<String> s2 = list.stream().skip(2);
        // concat:将s1,s2两个流合二为一，distinct:去掉流中重复的元素
        Stream.concat(s1, s2).distinct().forEach(System.out::println);
        System.out.println("-------------");
        list.stream().distinct().forEach(System.out::println);
    }
}
