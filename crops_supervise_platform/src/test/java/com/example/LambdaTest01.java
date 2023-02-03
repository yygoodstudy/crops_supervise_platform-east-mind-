package com.example;

import javax.print.DocFlavor;
import java.util.*;

/**
 * @Author yuanyao
 * @Date 2022/10/28
 */
public class LambdaTest01 {
    public static void main(String[] args) {
        lambdaTest02();
        print99();
        test03();
        test04();
    }

    private static void lambdaTest01() {
        // 1.匿名内部类写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world!");
            }
        }).start();

        // 2.lambda表达式写法
        new Thread(() -> {
            System.out.println("hello world with lambda~");
        }).start();

        // 3.简化lambda
        Thread t1 = new Thread(() -> System.out.println("hello world123"));
        t1.start();
    }


    public static void lambdaTest02() {
        List<String> names = new ArrayList<>();
        names.add("zsf");
        names.add("lisi");
        names.add("ww");
        names.add("zlwan");

        // 1.比较器常规写法,匿名内部类写法
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        Collections.sort(names, (a, b) -> b.length() - a.length());
//        Collections.sort(names,null);
        System.out.println(names);


        Comparator<Integer> comparator = (a, b) -> {
            return a - b;
        };
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 2, 1, 10, 13, 19);
        System.out.println("比较前：" + list);
        Collections.sort(list, comparator);
        System.out.println("比较后：" + list);
//        Collections.sort(names, Comparator.comparingInt(String::length));
//        names.forEach(System.out::println);
    }

    public static void print99() { // 打印99乘法表
        for (int i = 0; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

    public static void test03() {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "AAAA", "BBBB", "CCCC", "DDDD");
        strings.forEach(t -> System.out.print(t + "\t"));
    }

    public static void test04() {
        HashMap<String, Double> map = new HashMap<>();
        map.put("周瑜", 9000.0);
        map.put("宋江", 12000.0);
        map.put("张飞", 8000.0);

        map.forEach((k, v) -> {
            if (v < 10000.0)
                map.put(k, 10000.0);
        });
        map.forEach((k, v) -> System.out.print(k + ":" + v+"\t\t"));
    }


}
