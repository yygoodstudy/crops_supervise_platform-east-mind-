package com.example.designmode.factory.factorymode;

/**
 * @Author yuanyao
 * @Date 2023/2/2
 */
public class SendFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
