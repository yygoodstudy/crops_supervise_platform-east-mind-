package com.example.designmode.factory.abstractfactory;

/**
 * @Author yuanyao
 * @Date 2023/2/2
 */
public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is mail sender!!!");
    }
}
