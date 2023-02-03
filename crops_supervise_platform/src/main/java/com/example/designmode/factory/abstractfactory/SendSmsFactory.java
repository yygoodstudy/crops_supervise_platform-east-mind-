package com.example.designmode.factory.abstractfactory;

/**
 * @Author yuanyao
 * @Date 2023/2/2
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
