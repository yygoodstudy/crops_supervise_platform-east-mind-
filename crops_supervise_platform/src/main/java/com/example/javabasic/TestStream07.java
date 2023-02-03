package com.example.javabasic;

import java.util.ArrayList;

/**
 * @Author yuanyao
 * @Date 2022/12/28
 */
public class TestStream07 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        list.add(new User("liubei", "111", 40));
        list.add(new User("zhangfei", "222", 30));
        list.add(new User("guanyu", "333", 35));

        list.stream().map(x -> {
            x.setAge(33);
            return x;
        }).forEach(System.out::println);

        list.stream().map(User::getUsername).forEach(System.out::println);
        list.stream().map(User::getPassword).map(n->n).forEach(System.out::println);
    }
}
