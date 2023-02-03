package com.example.genericity;

/**
 * @Author yuanyao
 * @Date 2022/11/10
 */
public interface GenericInterface<T> {
    T show(T value);
}
class StringShow implements GenericInterface<String>{
    @Override
    public String show(String value) {
        return value;
    }
}

class BooleanShow implements GenericInterface<Boolean>{
    @Override
    public Boolean show(Boolean value) {
        return value;
    }
}

class Main{
    public static void main(String[] args) {
        StringShow stringShow = new StringShow();
        String info = stringShow.show("aaa");
        System.out.println("info = " + info);

        BooleanShow booleanShow = new BooleanShow();
        Boolean show = booleanShow.show(false);
        System.out.println(show);

        StringShow stringShow1 = new StringShow();
    }
}