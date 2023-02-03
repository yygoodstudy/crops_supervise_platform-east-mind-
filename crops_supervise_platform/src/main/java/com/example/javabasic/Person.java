package com.example.javabasic;

import java.io.*;

/**
 * @Author yuanyao
 * @Date 2022/11/30
 */
public class Person implements Serializable {
    private String name;
    private int age;
    static int i = 1;

    public Person(String name, int age) {
        ++i;
        this.age = age;
        this.name = name;
    }

    public void increase() {
        System.out.println(i++);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

     /*   // 系列化
        FileOutputStream fos = new FileOutputStream("person.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Person("美丽的神话", 19));

        // 反序列化
        FileInputStream fis = new FileInputStream("person.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person o = (Person) ois.readObject();
        System.out.println("o = " + o);*/
//        for (int i1 = 0; i1 < 10; i1++) {
//            new Person("ss",i1);
//            System.out.println(Person.i);
//        }
        int i = 's' - 'p';
        System.out.println(i);
        int a = 'a';
        int b = 'b';
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        char c = 'c';
        System.out.println("c = " + (int)c);
        char d = 'd';
        System.out.println("d = " + (int)d);
        int i1 = a - c;
        System.out.println("i1 = " + i1);
    }
}
