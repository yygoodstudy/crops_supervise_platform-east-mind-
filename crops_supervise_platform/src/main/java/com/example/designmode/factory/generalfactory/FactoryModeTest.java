package com.example.designmode.factory.generalfactory;

/**
 * 普通工厂方法模式
 *
 * @Author yuanyao
 * @Date 2023/2/2
 */
public class FactoryModeTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender mail = factory.produce("email");
        mail.send();
        Sender sms = factory.produce("sms");
        sms.send();
    }
}
