package com.example.oop;

/**
 * @Author yuanyao
 * @Date 2022/11/11
 */
public interface Cat extends Smilodon {
    String fish = "白条";

    void play(); // 抽象方法

    static void eat() {
        System.out.println("猫吃鱼~");
    }

    default void run() { // 相当于抽象类中的非抽象的方法，该接口的实现类都会继承该方法，也可以对该方法进行重写
        System.out.println("猫咪在悠闲的散步~！@");
    }

    default void climb() {
        System.out.println("猫咪在爬树！@#*&");
    }
}

@SuppressWarnings("all")
interface Smilodon {
    String name = "剑齿虎";

    default void hunting() {
        System.out.println("我叫" + name + "，我是猫类的祖先，我喜欢吃羚羊！");
    }
}

class OrangeCat implements Cat {
    @Override
    public void play() {
        System.out.println("猫咪在吃" + Cat.fish);
    }

    @Override
    public void hunting() {
        System.out.println("我是橘猫，我喜欢吃鱼儿");
    }
}

class MainTest {
    public static void main(String[] args) {
        OrangeCat orangeCat = new OrangeCat();
        orangeCat.play();
        orangeCat.climb();
//        orangeCat.hunting();

        Smilodon smilodon = new OrangeCat(); // 父类引用指向子类对象，父类的引用只能调用在父类中存在的方法，不能调用子类特有的方法；
        smilodon.hunting();
    }
}