package com.example.genericity;

/**
 * 泛型类
 * @Author yuanyao
 * @Date 2022/11/10
 */
public class GenericClass <T,R>{
    private R age;
    private T value;
    public GenericClass(T value,R age){
        this.value = value;
        this.age = age;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public R getAge() {
        return age;
    }

    public void setAge(R age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "age=" + age +
                ", value=" + value +
                '}';
    }
}
