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
            number = Integer.parseInt(str); // ��һ�г������쳣������Զ�����һ��NumberFormatException�쳣��try������еĴ��벻���������ִ��
            // ��ֱ��������Ӧ��catch����
            System.out.println("hello -1");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("ת�������쳣�ˣ� -1");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("ת�������쳣�ˣ� -2");
        }
        System.out.println("hello -2");
    }
}
