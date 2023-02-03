package com.example.exception;

/**
 * @Author yuanyao
 * @Date 2023/1/12
 */
public class TestException1 {
    public static void main(String[] args) {
        methodA(1, 0);
    }

    public static void methodA(int a, int b) {
        methodB(a, b);
    }

    public static void methodB(int a, int b) {
        String s = methodC(a, b);
        System.out.println(s);
    }

    public static String methodC(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            e.printStackTrace();
            return "catch block return";
        } finally {
//            return "finally block return";
            System.out.println("程序发生异常并且有return语句..finally块中代码执行了");
        }
        System.out.println("对可能发生异常的代码处理后，程序继续往后执行！");
        return "C";
    }
}
