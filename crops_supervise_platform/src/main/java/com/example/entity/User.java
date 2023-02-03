package com.example.entity;

/**
 * @Author yuanyao
 * @Date 2023/2/2
 */
public class User {
}

/**
 * 包访问权限[package、包、默认访问权限]只能本包中可以访问
 */
class Hello {
    public static void show() {
        System.out.println("hello world");
    }

    public void test() {
        System.out.println("天地苍茫，展开翅膀，");
    }
}
