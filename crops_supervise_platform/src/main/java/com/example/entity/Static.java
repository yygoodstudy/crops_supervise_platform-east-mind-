package com.example.entity;

/**
 * @Author yuanyao
 * @Date 2023/2/2
 */
public class Static extends Base{
    static {
        System.out.println("test static");
    }

    public Static() {
        System.out.println("test constructor");
    }

    public static void main(String[] args) {
        new Static();
    }
}

class Base {
    static {
        System.out.println("base static");
    }

    public Base() {
        System.out.println("base constructor");
    }
}