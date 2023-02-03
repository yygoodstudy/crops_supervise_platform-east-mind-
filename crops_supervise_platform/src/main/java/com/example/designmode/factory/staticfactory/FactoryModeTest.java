package com.example.designmode.factory.staticfactory;

/**
 * @Author yuanyao
 * @Date 2023/2/2
 */
public class FactoryModeTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.send();
        Sender smsSender = SendFactory.produceSms();
        smsSender.send();
    }
}
