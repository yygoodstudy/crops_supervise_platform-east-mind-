package com.example.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * JAVA序列化测试
 */
@SuppressWarnings("all")
public class Person implements Serializable {
    private String username;
    private int age;

    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}

class WriteObject {
    public static void main(String[] args) throws IOException {
        // 创建一个ObjectOutputStream输出流
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream oos = null;
        try {
            fileOutputStream = new FileOutputStream("object.txt");
            oos = new ObjectOutputStream(fileOutputStream);
            // 将对象序列化到文件中
            Person person = new Person("zhangJie", 27);
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert fileOutputStream != null;
            fileOutputStream.close();
            assert oos != null;
            oos.close();
        }
    }
}