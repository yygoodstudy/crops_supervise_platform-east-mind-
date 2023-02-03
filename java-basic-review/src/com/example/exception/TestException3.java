package com.example.exception;

/**
 * @Author yuanyao
 * @Date 2023/1/15
 */
public class TestException3 {
    public static void main(String[] args) {
        test01();
    }


    public static void test01() {
        String str = "123";
        str = "abc";
        int number = 0;
        try {
            number = Integer.parseInt(str); // 这一行出现了异常程序会自动生成一个NumberFormatException异常，try代码块中的代码不会继续往下执行
            // 会直接跳到对应的catch块中
            System.out.println("hello -1");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("转换发生异常了！ -1");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("转换发生异常了！ -2");
        }
        System.out.println("hello -2");
    }
}
