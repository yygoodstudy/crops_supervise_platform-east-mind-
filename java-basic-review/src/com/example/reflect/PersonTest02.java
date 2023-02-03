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
        // ��������������
        System.out.println("clazzName = " + clazzName);

        // ��ȡ�������public���ε�����
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println("--------------");
        // ��ȡ����������ԣ�����������Ҳ����˽�е�
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Person person = clazz.newInstance(); // ͨ�����䴴��Person�����
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person,"�Ž�");
        System.out.println(person);

        Method say = clazz.getDeclaredMethod("say");
        say.setAccessible(true);
        say.invoke(person);

    }
}
