package com.example.designmode.factory.abstractfactory;

/**
 * 抽象工厂模式
 *
 * @Author yuanyao
 * @Date 2023/2/2
 */
public class Test {
    public static void main(String[] args) {
        SendMailFactory mailFactory = new SendMailFactory();
        Sender produce = mailFactory.produce();
        produce.send();

        SendSmsFactory sendSmsFactory = new SendSmsFactory();
        Sender produce1 = sendSmsFactory.produce();
        produce1.send();
    }
}
