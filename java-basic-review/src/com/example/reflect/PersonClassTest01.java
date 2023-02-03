package com.example.reflect;

/**
 * 一个类在一个jvm中只会有一个Class实例
 *
 * @Author yuanyao
 * @Date 2022/11/10
 */
@SuppressWarnings("all")
public class PersonClassTest01 {

    public static void main(String[] args) throws ClassNotFoundException {
        // 得到Class对象的三种方式
        // 1.Person.class
        Class<Person> personClass = Person.class;

        Person person = new Person();
        // 2.对象.getClass()方法
        Class<? extends Person> aClass = person.getClass();

        // 3.Class.forName("类的全限定名")
        Class<?> aClass1 = Class.forName("com.example.reflect.Person");

        boolean b = personClass == aClass;
        boolean b1 = aClass == aClass1;
        System.out.println(b);
        System.out.println(b1);
    }
}
