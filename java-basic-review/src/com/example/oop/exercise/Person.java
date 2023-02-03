package com.example.oop.exercise;

import java.util.Arrays;
import java.util.List;

/**
 * @Author yuanyao
 * @Date 2022/9/16
 */

public class Person {
    private String name;
    private Integer age;
    private char sex;

    public Person() {
    }

    public Person(String name, Integer age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

class Student extends Person {
    private List<Double> scores;

    public Student(List<Double> scores) {
        this.scores = scores;
    }

    public Student(String name, Integer age, char sex, List<Double> scores) {
        super(name, age, sex);
        this.scores = scores;
    }

    public List<Double> getScores() {
        return scores;
    }

    public void setScores(List<Double> scores) {
        this.scores = scores;
    }
}

class Main {
    public static void main(String[] args) {
        List<Double> scores = Arrays.asList(60d, 66d, 69d, 80.5d, 89d);
        Student student = new Student("张三", 22, '男', scores);
        // 求平均值
        Double average = student.getScores().stream().mapToDouble(Number::doubleValue).average().getAsDouble();
        System.out.println("average = " + average);
    }
}