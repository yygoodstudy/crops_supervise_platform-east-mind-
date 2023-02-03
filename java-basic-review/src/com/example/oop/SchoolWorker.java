package com.example.oop;

public class SchoolWorker {
    private String name;
    private Character sex;
    private Integer age;

    public void eat(String food) {
        System.out.println(this.name + "正在吃" + food);
    }

    public void sleep() {
        System.out.println(this.name + "正在sleeping...");
    }

    public void walk() {
        System.out.println(this.name + "正在走路~~~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
