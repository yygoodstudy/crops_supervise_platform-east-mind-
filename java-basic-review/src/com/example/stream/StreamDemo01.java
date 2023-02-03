package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * stream���ļ��÷�demo1
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

        // 1.�����ڲ����д��:
        stream.filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 2;
            }
        }).forEach(System.out::println);

        // 2.lambda���ʽ��д��
//        stream.filter(z -> z > 2).forEach(System.out::println);

        List<Student> students =
                new ArrayList<>(Arrays.asList(new Student("��YueYue", 60, Arrays.asList("English", "Chinese", "Math", "Coding")),
                        new Student("�ž޻�", 88, Collections.singletonList("Music")),
                        new Student("�ܽ���", 99, Arrays.asList("Music", "R&B", "ROCK")),
                        new Student("��ޱ", 79, Arrays.asList("Performance", "Music")),
                        new Student("��ޱ", 79, Arrays.asList("Performance", "Music"))));
        /*
        filter:ͨ������ɸѡ���е�Ԫ��
        limit(n):��ȡǰn��Ԫ��
        skip(n):����n��Ԫ�أ�ȡʣ�µ�Ԫ��
        distinct():ͨ��equals��hashcode����ȥ���ظ�Ԫ��
        */

//        students.stream().filter(student -> student.getCourse().size()>=2).skip(1).limit(3).forEach(System.out::println);
        // distinct()ͨ������equals��hashcode����ȥ��List<Student>���ظ���Student
        students.stream().distinct().forEach(System.out::println);
    }
}
