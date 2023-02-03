package com.example.reflect;

/**
 * һ������һ��jvm��ֻ����һ��Classʵ��
 *
 * @Author yuanyao
 * @Date 2022/11/10
 */
@SuppressWarnings("all")
public class PersonClassTest01 {

    public static void main(String[] args) throws ClassNotFoundException {
        // �õ�Class��������ַ�ʽ
        // 1.Person.class
        Class<Person> personClass = Person.class;

        Person person = new Person();
        // 2.����.getClass()����
        Class<? extends Person> aClass = person.getClass();

        // 3.Class.forName("���ȫ�޶���")
        Class<?> aClass1 = Class.forName("com.example.reflect.Person");

        boolean b = personClass == aClass;
        boolean b1 = aClass == aClass1;
        System.out.println(b);
        System.out.println(b1);
    }
}
