package com.example.designmode.factory.staticfactory;

/**
 * @Author yuanyao
 * @Date 2023/2/2
 */
public class SendFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
