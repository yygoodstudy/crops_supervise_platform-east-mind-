package com.example.reflect;

/**
 * @Author yuanyao
 * @Date 2022/11/10
 */
public class Person {
    private String name = "Tom";
    public int age = 18;

    public Person() {
    }

    private void say() {
        System.out.println("i'm " + name + ",and i'm " + age + " years old");
    }

    // 公有方法
    public void work() {
        System.out.println("public work()...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
