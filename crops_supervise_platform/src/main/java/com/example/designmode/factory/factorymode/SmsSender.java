package com.example.designmode.factory.factorymode;

/**
 * @Author yuanyao
 * @Date 2023/2/2
 */
public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is sms sender~");
    }
}
