package com.example.annotation;

/**
 * @Author yuanyao
 * @Date 2022/11/10
 */
@MyAnno(age = 11, sex = false, value = "������������", names = {"spring", "summer", "autumn", "winter"}, season = Season.AUTUMN, notnull = @NotNull(message = "һ������������ˮһ�����˺�"))
public class AnnoDemo1 {
    @Override
    public String toString() {
        return "AnnoDemo1{}";
    }

    @Deprecated
    public void show1() {
    }

    public void show2() {
    }
}
