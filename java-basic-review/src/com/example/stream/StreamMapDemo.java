package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * stream().map()
 * stream().flatmap()方法的用法
 *
 * @Author yuanyao
 * @Date 2022/11/11
 */
@SuppressWarnings("all")
public class StreamMapDemo {

    public static void main(String[] args) {
        List<Student> students =
                new ArrayList<>(Arrays.asList(new Student("阿YueYue", 60, Arrays.asList("English", "Chinese", "Math", "Coding")),
                        new Student("古巨基", 88, Collections.singletonList("Music")),
                        new Student("周杰伦", 99, Arrays.asList("Music", "R&B", "ROCK")),
                        new Student("赵薇", 79, Arrays.asList("Performance", "Music")),
                        new Student("赵薇", 79, Arrays.asList("Performance", "Music"))));

        // 1.匿名内部类的写法
        /*
        List<Object> list = students.stream().map(new Function<Student, Object>() {
            @Override
            public Object apply(Student student) {
                return student.getCourse();
            }
        }).collect(Collectors.toList());

        for (Object o : list) {
            System.out.println(o);
        }
        */

        // 2.lambda表达式写法
        /*
            map(Function<Student,Object>):接受一个函数作为参数，通过该函数遍历集合中的每个元素，将集合中的每个元素的共同属性提取出来生成新的Stream流
         */
        List<List<String>> collect = students.stream().map(student -> student.getCourse()).collect(Collectors.toList());
        for (List<String> courses : collect) {
            System.out.println(courses);
        }


        List<String> list = Arrays.asList("a,b,c", "1,2,3");
//        list.stream().map(s -> s.replaceAll(",", "")).forEach(System.out::println); // [abc,123]

//        list.stream().flatMap(new Function<String, Stream<?>>() {
//            @Override
//            public Stream<?> apply(String s) { // 将集合中的每个元素转换成新的Stream流并返回，并把这些新的Stream流组成新的流
//                return Arrays.stream(s.split(","));
//            }
//        }).forEach(new Consumer<Object>() { // Consumer(Object o):接受一个Object
//            @Override
//            public void accept(Object o) { // 对这个Object进行操作
//                System.out.println(":" + o);
//            }
//        });
//        list.stream().forEach(new StreamMapDemo()::println);  // 要求方法非static
        list.stream().forEach(StreamMapDemo::println);
    }

    public static void println(Object o) {
        System.out.println("o = " + o);
    }
}
