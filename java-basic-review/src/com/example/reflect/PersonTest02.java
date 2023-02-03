package com.example.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author yuanyao
 * @Date 2022/11/10
 */
public class PersonTest02 {
    public static void main(String[] args) throws NoSuchFieldException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Person> clazz = Person.class;
        String clazzName = clazz.getName();
        // 获得类的完整名称
        System.out.println("clazzName = " + clazzName);

        // 获取类的所有public修饰的属性
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println("--------------");
        // 获取类的所有属性，包括公开的也包括私有的
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Person person = clazz.newInstance(); // 通过反射创建Person类对象
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person,"张洁");
        System.out.println(person);

        Method say = clazz.getDeclaredMethod("say");
        say.setAccessible(true);
        say.invoke(person);

    }
}
