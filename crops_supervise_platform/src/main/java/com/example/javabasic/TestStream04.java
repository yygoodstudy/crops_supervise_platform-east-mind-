package com.example.javabasic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yuanyao
 * @Date 2022/12/28
 */
public class TestStream04 {
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");
        list.add("张洁");
        list.add("张雨洁");

        long 洁 = list.stream().filter(x -> x.endsWith("洁")).count();
        System.out.println("洁 = " + 洁);
    }
}
