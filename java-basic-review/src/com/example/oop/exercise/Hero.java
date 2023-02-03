package com.example.oop.exercise;

import java.util.Scanner;

/**
 * @Author yuanyao
 * @Date 2022/9/16
 */
public class Hero {
    private String name; // Ӣ������
    private double healthPoint; // ����ֵ
    private int level; // Ӣ�۵ȼ�

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
            System.out.println("��������Ҫʹ�õ�Ӣ�۵����֣�");
            this.name = scanner.next();
        }
        scanner.close();
    }

    public void printHeroName() {
        System.out.println("��Ҫʹ�õ�Ӣ��Ϊ��" + this.name);
    }
}

class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.inputHeroName(); // ����Ӣ������
        hero.printHeroName(); // ��ӡӢ������
    }
}