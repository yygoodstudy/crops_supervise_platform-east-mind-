package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author yuanyao
 * @Date 2022/9/26
 */
public class StreamTest1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Stream<String> stream = strings.stream(); // ?????
        Stream<String> stringStream = strings.parallelStream(); // ??????

        List<Student> students = new ArrayList<>();
        students.add(new Student("zs", 55, Arrays.asList("????", "???", "???", "????")));
        students.add(new Student("lisi", 79, Arrays.asList("????", "???", "???", "????")));
        students.add(new Student("wangwu", 59, Arrays.asList("????", "???", "???", "????")));
        students.add(new Student("zhaoliu", 85, Arrays.asList("????", "???", "???", "????")));

        List<Student> students1 = students.stream().filter(x -> x.getScore() < 60).collect(Collectors.toList());
        students1.forEach(System.out::println);


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        integers.stream().reduce((a,b)->a+b);
    }
}
