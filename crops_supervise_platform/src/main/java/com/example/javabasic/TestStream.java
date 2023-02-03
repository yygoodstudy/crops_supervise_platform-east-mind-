package com.example.javabasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author yuanyao
 * @Date 2022/12/27
 */
public class TestStream {
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张宝洁");
        list.add("张无忌");
        list.stream().filter(x -> x.startsWith("张")).filter(x -> x.length() == 3).forEach(System.out::println);
        System.out.println("--------------------------------");
        // 取前两个数据在控制台输出
        list.stream().filter(x -> x.length() == 3).limit(2).forEach(System.out::println);
        System.out.println("----------------------------------");
        // 跳过前两个数据，展示后面得数据
        list.stream().filter(x -> x.length() == 3).skip(2).forEach(System.out::println);

        System.out.println("--------------------");
        // 将两个流合二为一，再进行操作
        Stream.concat(list.stream(), Arrays.asList("马天宇", "古巨基", "该死的温柔","情歌王").stream()).forEach(System.out::println);
    }
}
