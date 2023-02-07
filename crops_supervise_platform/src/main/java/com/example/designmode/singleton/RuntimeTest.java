package com.example.designmode.singleton;

/**
 * @Author yuanyao
 * @Date 2023/2/3
 */
public class RuntimeTest {
    public static void main(String[] args) {
        // 获取cpu核数
        int count = Runtime.getRuntime().availableProcessors();
        System.out.println("count = " + count);
    }
}
