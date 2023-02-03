package com.example.javabasic;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author yuanyao
 * @Date 2022/12/28
 */
public class TestArray01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, InvocationTargetException, CloneNotSupportedException {
       /* ArrayList<Person> peoples = new ArrayList<>();
        peoples.add(new Person("王力宏", 33));
        peoples.add(new Person("古巨基", 39));
        peoples.add(new Person("周杰伦", 29));
        Person[] elements = (Person[]) peoples.toArray();
        System.out.println("elements.getClass() = " + elements.getClass());

//        System.out.println(elements.getClass() == Object[].class);
        Arrays.stream(elements).forEach(System.out::println);
        Object[] objects =  Arrays.copyOf(elements, elements.length, Object[].class);
        System.out.println(objects);*/

        User user1 = new User();
        System.out.println("user1 = " + user1);

        User user2 = User.class.newInstance();
        System.out.println("user2 = " + user2);

        Object user3 = Class.forName("com.example.javabasic.User").newInstance();
        System.out.println("user3 = " + user3);

        Object o = User.class.getConstructors()[0].newInstance();
        System.out.println("o = " + o);

        Object obj  = user1.clone();

        System.out.println(obj == user1);
        System.out.println(obj.hashCode());
        System.out.println(user1.hashCode());
    }
}
