package com.example.designmode.singleton;

/**
 * 懒汉模式：双重校验锁
 * 双重校验锁机制既保证了线程的安全性，又比直接上锁提高了执行效率，还节省了内存空间
 * @Author yuanyao
 * @Date 2023/2/3
 */
@SuppressWarnings("all")
public class Singleton6 {
    // volatile关键字可以保证多个线程的可见性，但是不能保证原子性。同时它也能防止指令重排序
    private static volatile Singleton6 singleton6;

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        if (singleton6 == null) { // 在加锁之前进行判断是否为空，可以确保instance不为空的情况下，可以直接返回
            synchronized (Singleton6.class) {
                if (singleton6 == null) { // 是为了防止多线程在并发的情况下创建多个对象
//                    比如：线程a和线程b同时调用getInstance方法，假如同时判断INSTANCE都为空，这时会同时进行抢锁。
//                    假如线程a先抢到锁，开始执行synchronized关键字包含的代码，此时线程b处于等待状态。
//                    线程a创建完新实例了，释放锁了，此时线程b拿到锁，进入synchronized关键字包含的代码，如果没有再判断一次INSTANCE是否为空，
//                    则可能会重复创建实例。
                    singleton6 = new Singleton6();
                }
            }
        }
        return singleton6;
    }
}
