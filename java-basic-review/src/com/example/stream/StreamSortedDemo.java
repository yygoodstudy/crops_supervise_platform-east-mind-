package com.example.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author yuanyao
 * @Date 2022/11/11
 */
@SuppressWarnings("all")
public class StreamSortedDemo {

    public static void main(String[] args) {
        List<Student> students =
                new ArrayList<>(Arrays.asList(new Student("阿YueYue", 60, Arrays.asList("English", "Chinese", "Math", "Coding")),
                        new Student("古巨基", 88, Collections.singletonList("Music")),
                        new Student("周杰伦", 99, Arrays.asList("Music", "R&B", "ROCK")),
                        new Student("赵薇", 79, Arrays.asList("Performance", "Music")),
                        new Student("姚张洁", 79, Arrays.asList("Performance", "Music"))));
        // 排序：匿名内部类的写法
        students.stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) o1.getScore() - (int) o2.getScore();
            }
        }).forEach(System.out::println);

        System.out.println("=============================");
        // lambda表达式写法,自定义Comparator排序器
        List<Student> sortedStudents = students.stream().sorted((x, y) -> {
            if (x.getScore() == y.getScore()) {
                return x.getName().length() - y.getName().length();
            }
            return (int) (x.getScore() - y.getScore());
        }).collect(Collectors.toList());
        sortedStudents.forEach(System.out::println);

        System.out.println("=============================");
        // 自然排序，流中元素需要实现Comparable<>接口
        sorted(students);
    }

    public static <T> void sorted(List<T> list) {
        list.stream().sorted().forEach(System.out::println);
    }
}
