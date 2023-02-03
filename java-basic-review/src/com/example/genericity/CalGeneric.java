package com.example.genericity;

/**
 * 带有泛型的计算器接口
 *
 * @Author yuanyao
 * @Date 2022/11/10
 */
public interface CalGeneric<T> {

    T add(T a, T b);

    T sub(T a, T b);

    T mul(T a, T b);

    T div(T a, T b);
}
