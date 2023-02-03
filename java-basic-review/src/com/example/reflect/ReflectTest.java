package com.example.reflect;

import java.lang.reflect.Field;
import java.sql.DriverManager;

/**
 * @Author yuanyao
 * @Date 2022/11/10
 */
@SuppressWarnings("all")
public class ReflectTest {

    public static void getParentField() throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<Parent> clazz = (Class<Parent>) Class.forName("com.example.reflect.Parent");
        Field privateField = clazz.getDeclaredField("privateField");
        privateField.setAccessible(true);
        String value = (String) privateField.get(clazz.newInstance());
        System.out.println("value = " + value);
    }

    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        getParentField();
    }
}
