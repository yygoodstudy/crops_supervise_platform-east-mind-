package com.example.designmode.singleton;

/**
 * @Author yuanyao
 * @Date 2023/2/2
 */
@SuppressWarnings("all")
public class SafeSingleton {
    private static SafeSingleton singleton1 = null;

    private SafeSingleton() {
    }

    public static synchronized SafeSingleton getInstance() {
        if (singleton1 == null)
            singleton1 = new SafeSingleton();
        return singleton1;
    }
}

class Test {
    public static void main(String[] args) {
        SafeSingleton s1 = SafeSingleton.getInstance();
        SafeSingleton s2 = SafeSingleton.getInstance();
        boolean b = s1 == s2;
        System.out.println(b);
    }
}