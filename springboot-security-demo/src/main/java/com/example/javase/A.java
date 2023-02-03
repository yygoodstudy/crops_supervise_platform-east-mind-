package com.example.javase;

/**
 * @Author yuanyao
 * @Date 2022/9/23
 */
public interface A {
    default void print(String str) {
        System.out.println(str);
    }

    void show();
}

interface C {
    default void print(String str) {
        System.out.println(str);
    }
}

/*
    1.实现类会继承接口中的default方法
    2.如果一个类同时实现接口A和B，接口A和B中有相同的default方法，这时，该类必须重写接口中的default方法
    3.如果子类继承父类，父类中有b方法，该子类同时实现的接口中也有b方法（被default修饰），那么子类会继承父类的b方法而不是继承接口中的b方法
 */
class B implements A, C {

    @Override
    public void print(String str) {
        System.out.println("而你现在还不懂，冷冷的烟雨中");
    }

    @Override
    public void show() {
        System.out.println("show().....");
    }

    public static void main(String[] args) {
        A a = new B();
        a.print("冬季到台北来看雨");
        a.show();
    }
}