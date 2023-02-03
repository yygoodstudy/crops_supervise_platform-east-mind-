package com.example.javase;

import lombok.ToString;

/**
 * @Author yuanyao
 * @Date 2022/9/14
 */
@ToString
public class Father {
    private String name = "张三"; // 父类中私有属性
    private String sex = "男";

    public void tell(){
        System.out.println("姓名："+name);
        System.out.println("性别："+sex);
    }

    private void speak(){
        System.out.println(name+"is speaking!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

class Child extends Father {

}
class Main{
    public static void main(String[] args) {
        Child child = new Child();
        child.tell();

        child.setName("张洁");
        child.setSex("性感的美女");

        System.out.println("child = " + child);

    }
}
