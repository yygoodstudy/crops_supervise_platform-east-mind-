package com.example.designmode.singleton.lazy;

/**
 * <h3 style="color:yellow">懒汉式单例模式：只有在需要的时候才创建对象</h3>
 * <p>优点：延迟加载(在需要的时候才去加载)</p>
 * 缺点：线程不安全，在多线程中容易出现不同步的情况，如在数据库对象进行频繁地读写操作时。
 *
 * @Author yuanyao
 * @Date 2023/2/2
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}

class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        boolean b = instance == instance1;
        System.out.println(b);
    }
}