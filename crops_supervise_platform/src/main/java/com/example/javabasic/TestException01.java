package com.example.javabasic;

/**
 * @Author yuanyao
 * @Date 2022/12/26
 */
public class TestException01 {
    public static void main(String[] args) throws Exception {
        System.out.println("怎么了");
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
//            throw new Exception("runtimeException~~~~~~~~");
        }
        System.out.println("程序继续走");
    }
}
