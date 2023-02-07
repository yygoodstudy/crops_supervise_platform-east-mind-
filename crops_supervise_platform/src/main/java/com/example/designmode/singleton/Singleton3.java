package com.example.designmode.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @Author yuanyao
 * @Date 2023/2/3
 */
public class Singleton3 {
    private static final Singleton3 SINGLETON_3 = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getSingleton3() {
        return SINGLETON_3;
    }
}

class Singleton4 {
    private static final Singleton4 singleton4;

    static {
        singleton4 = new Singleton4();
    }

    private Singleton4() {
    }

    public static Singleton4 getSingleton4() {
        return singleton4;
    }
}

class TestSingleton34 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Singleton3 singleton3 = Singleton3.getSingleton3();
        Singleton3 singleton31 = Singleton3.getSingleton3();
        System.out.println(singleton31 == singleton3);

        Singleton4 singleton4 = Singleton4.getSingleton4();
        Singleton4 singleton5 = Singleton4.getSingleton4();
        System.out.println(singleton4 == singleton5);

//        Singleton3 singleton32 = Singleton3.class.newInstance(); // 当某个类的构造方法是私有的，那么不能通过反射创建它的对象
//        System.out.println("singleton3 == singleton32 = " + (singleton3 == singleton32));
        Class<Singleton3> singleton3Class = Singleton3.class;
        Constructor<?>[] constructors = singleton3Class.getConstructors();
        Constructor<?>[] declaredConstructors = singleton3Class.getDeclaredConstructors();
        Arrays.stream(declaredConstructors).map(Constructor::getName).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println("constructors.length = " + constructors.length);
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }

        Class<Singleton3> aClass = Singleton3.class;
        Constructor<Singleton3> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton3 singleton32 = constructor.newInstance();
        System.out.println("singleton32 = " + singleton32);
    }
}