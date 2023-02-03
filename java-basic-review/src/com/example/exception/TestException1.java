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
            System.out.println("�������쳣������return���..finally���д���ִ����");
        }
        System.out.println("�Կ��ܷ����쳣�Ĵ��봦��󣬳����������ִ�У�");
        return "C";
    }
}
