package com.example.genericity;

/**
 * ���������
 *
 * @Author yuanyao
 * @Date 2022/11/10
 */
public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<String, Integer> generic = new GenericClass<>("�Ž�", 20);
        System.out.println(generic);

        GenericClass<String, Boolean> genericClass = new GenericClass<String, Boolean>("taishang",false);
        System.out.println(genericClass);
    }
}
