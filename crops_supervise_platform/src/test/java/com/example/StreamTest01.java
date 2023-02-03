package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author yuanyao
 * @Date 2022/10/28
 */
public class StreamTest01 {
    public static void main(String[] args) {
        List<Person> personList = getPersonList();
        personList.stream().filter(p -> p.getAge() <= 18).forEach(System.out::println);
        // 1.count()：统计数量
        long count = personList.stream().filter(p -> p.getCountry().equals("中国")).count();
        System.out.println("count = " + count);
        // 2.allMatch()所有都满足返回true，anyMatch(条件)：有任一条件满足时就返回true ,noneMatch(条件)：都不满足条件才返回true
        boolean china = personList.stream().filter(p -> p.getName().length() > 2).noneMatch(x -> x.getCountry().equals("日本"));
        System.out.println(china);

        personList.stream().filter(x -> x.getCountry().equals("中国")).sorted(Comparator.comparingInt(x -> x.getName().length()));

        // 3.map(x->x.getName.concat("yy)):将每个x的name拿出来并拼接yy生成一个新的Stream流
        List<String> yy = personList.stream().map(p -> p.getName().concat("yy")).collect(Collectors.toList());
        System.out.println(yy);

        String name = personList.stream().map(Person::getName).findFirst().get();
        System.out.println("name = " + name);
        // 求所有人中名字最长的人的姓名
        String nameN = personList.stream().map(Person::getName).max(Comparator.comparing(String::length)).get();
        System.out.println("nameN = " + nameN);


    }

    private static List<Person> getPersonList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("欧阳雪", 18, "中国", 'F'));
        personList.add(new Person("Tom", 24, "美国", 'M'));
        personList.add(new Person("Harley", 22, "英国", 'F'));
        personList.add(new Person("向天笑ssssss", 20, "中国", 'M'));
        personList.add(new Person("李康", 22, "中国", 'M'));
        personList.add(new Person("小梅", 20, "中国", 'F'));
        personList.add(new Person("何雪", 21, "中国", 'F'));
        personList.add(new Person("李康", 22, "中国", 'M'));
        return personList;
    }
}
