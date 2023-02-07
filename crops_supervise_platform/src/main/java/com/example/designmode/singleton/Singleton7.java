package com.example.designmode.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author yuanyao
 * @Date 2023/2/3
 */
public class Singleton7 {

    private Singleton7() {
        if (Singleton.SINGLETON_7 != null) {
            throw new RuntimeException("不能支持重复实例化对象！"); // 防止Java通过反射创建对象
        }
    }

    public static Singleton7 getInstance() {
        return Singleton.SINGLETON_7;
    }

    public static class Singleton {
        private static final Singleton7 SINGLETON_7 = new Singleton7();
    }
}

class AppTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Singleton7 instance1 = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        System.out.println("instance1 == instance2 = " + (instance1 == instance2)); // true

        Constructor<Singleton7> constructor = Singleton7.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton7 singleton7 = constructor.newInstance(); // 通过反射调用私有构造方法创建对象
        System.out.println(instance1 == singleton7);

//        Singleton7 singleton7 = Singleton7.Singleton.SINGLETON_7;
//        Singleton7 singleton8 = Singleton7.Singleton.SINGLETON_7;
//        System.out.println("singleton7 == singleton8 = " + (singleton7 == singleton8));
    }
}