package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * stream流的简单用法demo1
 *
 * @Author yuanyao
 * @Date 2022/11/11
 */
public class StreamDemo01 {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = i;
        }
        Stream<Integer> stream = Arrays.stream(numbers);

        // 1.匿名内部类的写法:
        stream.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 2;
            }
        }).forEach(System.out::println);

        // 2.lambda表达式的写法
//        stream.filter(z -> z > 2).forEach(System.out::println);

        List<Student> students =
                new ArrayList<>(Arrays.asList(new Student("阿YueYue", 60, Arrays.asList("English", "Chinese", "Math", "Coding")),
                        new Student("古巨基", 88, Collections.singletonList("Music")),
                        new Student("周杰伦", 99, Arrays.asList("Music", "R&B", "ROCK")),
                        new Student("赵薇", 79, Arrays.asList("Performance", "Music")),
                        new Student("赵薇", 79, Arrays.asList("Performance", "Music"))));
        /*
        filter:通过条件筛选流中的元素
        limit(n):获取前n个元素
        skip(n):跳过n个元素，取剩下的元素
        distinct():通过equals和hashcode方法去掉重复元素
        */

//        students.stream().filter(student -> student.getCourse().size()>=2).skip(1).limit(3).forEach(System.out::println);
        // distinct()通过调用equals和hashcode方法去掉List<Student>中重复的Student
        students.stream().distinct().forEach(System.out::println);
    }
}
