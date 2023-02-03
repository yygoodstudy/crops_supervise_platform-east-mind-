package com.example.genericity;

import com.example.annotation.Test001;

/**
 * 泛型方法
 *
 * @Author yuanyao
 * @Date 2022/11/10
 */
public class GenericMethod {

    // 泛型方法
    /*
        <T, R, X>：声明该方法要使用哪些泛型，可以有多个；固定格式，必须写
        T：泛型方法的返回值，可以不是泛型类型
     */
    public static <T, R, X> T show(T t, R r, X x) {
        return t;
    }

    public static void main(String[] args) {
        String show = show("hello", "world", true);
        System.out.println(show);
    }
}
