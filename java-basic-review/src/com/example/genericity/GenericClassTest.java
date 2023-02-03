package com.example.genericity;

/**
 * ∑∫–Õ¿‡≤‚ ‘
 *
 * @Author yuanyao
 * @Date 2022/11/10
 */
public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<String, Integer> generic = new GenericClass<>("’≈Ω‡", 20);
        System.out.println(generic);

        GenericClass<String, Boolean> genericClass = new GenericClass<String, Boolean>("taishang",false);
        System.out.println(genericClass);
    }
}
