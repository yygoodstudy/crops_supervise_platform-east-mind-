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
                new ArrayList<>(Arrays.asList(new Student("��YueYue", 60, Arrays.asList("English", "Chinese", "Math", "Coding")),
                        new Student("�ž޻�", 88, Collections.singletonList("Music")),
                        new Student("�ܽ���", 99, Arrays.asList("Music", "R&B", "ROCK")),
                        new Student("��ޱ", 79, Arrays.asList("Performance", "Music")),
                        new Student("Ҧ�Ž�", 79, Arrays.asList("Performance", "Music"))));
        // ���������ڲ����д��
        students.stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) o1.getScore() - (int) o2.getScore();
            }
        }).forEach(System.out::println);

        System.out.println("=============================");
        // lambda���ʽд��,�Զ���Comparator������
        List<Student> sortedStudents = students.stream().sorted((x, y) -> {
            if (x.getScore() == y.getScore()) {
                return x.getName().length() - y.getName().length();
            }
            return (int) (x.getScore() - y.getScore());
        }).collect(Collectors.toList());
        sortedStudents.forEach(System.out::println);

        System.out.println("=============================");
        // ��Ȼ��������Ԫ����Ҫʵ��Comparable<>�ӿ�
        sorted(students);
    }

    public static <T> void sorted(List<T> list) {
        list.stream().sorted().forEach(System.out::println);
    }
}
