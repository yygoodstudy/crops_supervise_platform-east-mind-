package com.example.genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yuanyao
 * @Date 2022/11/10
 */
@SuppressWarnings("ALL")
public class Apple {
}

@SuppressWarnings("ALL")
class Orange<E extends Apple> { // 上界通配符：E必须是Apple类或者Apple的子类
    List<? super GenericMethod> list = null; // 下界通配符，?必须是GenericMethod类或者它的父类

    protected class Banana {
        public void print() {
            Orange.this.list = new ArrayList<>();
            List<? super GenericMethod> list = Orange.this.list;
            list.add(new GenericMethod());
            list.add(new GenericMethod());
            list.add(new GenericMethod());
            list.add(new GenericMethod());
            list.forEach(System.out::println);
        }
    }

    public static void main(String[] args) {
        Orange<Apple> appleOrange = new Orange<>();
        // 创建内部类对象的方式，先要创建外部类的对象,通过外部类的对象创建内部类的对象
        Orange.Banana banana = appleOrange.new Banana();
        banana.print();
    }
}

