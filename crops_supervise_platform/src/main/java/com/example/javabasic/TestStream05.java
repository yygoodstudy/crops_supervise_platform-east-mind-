package com.example.javabasic;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Author yuanyao
 * @Date 2022/12/28
 */
public class TestStream05 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> manList = new ArrayList<String>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");

        ArrayList<String> womanList = new ArrayList<String>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("赵薇");
        womanList.add("林志玲");
        womanList.add("王祖贤");

        manList.stream().filter(x -> x.length() == 3).limit(3).forEach(System.out::println);
        System.out.println("=================================");
        womanList.stream().filter(x -> x.startsWith("林")).skip(1).forEach(System.out::println);
        System.out.println("--------------------------------");
        Stream<String> man = manList.stream().filter(x -> x.length() == 3).limit(3);
        Stream<String> woman = womanList.stream().filter(x -> x.startsWith("林")).skip(1);
        // 把过滤后的男演员和女演员姓名合并到一起
//        Stream.concat(man, woman).forEach(System.out::println);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Stream.concat(man, woman).map(Actor::new).forEach(p-> System.out.print(p.getName()+" "));
    }
}
