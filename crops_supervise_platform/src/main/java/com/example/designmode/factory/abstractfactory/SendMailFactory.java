package com.example.designmode.factory.abstractfactory;

/**
 * @Author yuanyao
 * @Date 2023/2/2
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
