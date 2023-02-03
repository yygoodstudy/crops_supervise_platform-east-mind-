package com.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author yuanyao
 * @Date 2022/12/7
 */
public class MathUtil {
    public static void main(String[] args) {
//        ArrayList<Integer> ints = new ArrayList<>();
//        for (int i = 0; i < 30; i++) {
//            ints.add(i+1);
//        }
//        System.out.println(ints);
        sum();
    }

    public static void sum(){
        int[] numbers = {460,290,355,210,259,298,324,395,402,738,519,499};
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);
    }
}
