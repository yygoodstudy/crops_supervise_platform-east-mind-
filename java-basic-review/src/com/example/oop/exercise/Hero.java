package com.example.oop.exercise;

import java.util.Scanner;

/**
 * @Author yuanyao
 * @Date 2022/9/16
 */
public class Hero {
    private String name; // 英雄名字
    private double healthPoint; // 生命值
    private int level; // 英雄等级

    public Hero(double healthPoint, int level) {
        this.healthPoint = healthPoint;
        this.level = level;
    }

    public Hero() {
        this.healthPoint = 100;
        this.level = 1;
    }

    public String getName() {
        return name;
    }

    public void inputHeroName() {
        Scanner scanner = new Scanner(System.in);
        while ("".trim().equals(this.name) || this.name == null) {
            System.out.println("请输入您要使用的英雄的名字：");
            this.name = scanner.next();
        }
        scanner.close();
    }

    public void printHeroName() {
        System.out.println("您要使用的英雄为：" + this.name);
    }
}

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.inputHeroName(); // 输入英雄名字
        hero.printHeroName(); // 打印英雄名字
    }
}