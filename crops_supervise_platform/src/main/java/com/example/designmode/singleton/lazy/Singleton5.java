package com.example.designmode.singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * java的单例模式是可以通过反射机制创建单例模式的对象的
 * Constructor<Singleton5> constructor = singleton5Class.getDeclaredConstructor();
 *
 * @Author yuanyao
 * @Date 2023/2/3
 */
public class Singleton5 {
    private static final Singleton5 SINGLETON_5 = new Singleton5();

    private Singleton5() {
    }

    public static Singleton5 getSingleton5() {
        return SINGLETON_5;
    }
}

class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Singleton5> singleton5Class = Singleton5.class;
        Constructor<Singleton5> constructor = singleton5Class.getDeclaredConstructor();
        constructor.setAccessible(true); // 抑制Java的访问检查，私有的也可以直接访问
        Singleton5 singleton5 = constructor.newInstance();
        System.out.println("singleton5 = " + singleton5);

        Singleton5 singleton51 = Singleton5.getSingleton5();
        System.out.println("singleton51 == singleton5 = " + (singleton51 == singleton5));
    }
}
