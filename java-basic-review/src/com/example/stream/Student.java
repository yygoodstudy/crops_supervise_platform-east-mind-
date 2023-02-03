package com.example.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @Author yuanyao
 * @Date 2022/9/26
 */

public class Student implements Comparable<Student> {
    private String name;

    /**
     * ???????
     */
    private double score;

    /**
     * ????¦Ã?
     */
    List<String> course;

    public Student(String name, double score, List<String> course) {
        this.name = name;
        this.score = score;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public List<String> getCourse() {
        return course;
    }

    @Override
    public int hashCode() {
        int hashcode = 7;
        hashcode = 13 * hashcode + (name == null ? 0 : name.hashCode());
        return hashcode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        Student student = null;
        if (obj instanceof Student) {
            student = (Student) obj;
        }
        if (this == student) {
            return true;
        }
        if (this.getName().equals(student.getName()) && this.getScore() == student.getScore()) {
            return true;
        }
        return false;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int v = (int) (this.getScore() - o.getScore());
        if (v == 0) {
            return this.getName().length() - o.getName().length();
        }
        return v;
    }
}
