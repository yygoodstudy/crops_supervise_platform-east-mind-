package com.example.designmode.factory.factorymode;

/**
 * @Author yuanyao
 * @Date 2023/2/2
 */
public class FactoryModeTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();
        Sender smsSender = factory.produceSms();
        smsSender.send();
    }
}
