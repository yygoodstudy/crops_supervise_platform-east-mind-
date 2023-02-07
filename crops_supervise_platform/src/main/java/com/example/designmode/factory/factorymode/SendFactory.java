package com.example.designmode.factory.factorymode;

/**
 * 多个工厂方法模式：该模式是对普通工厂方法模式的改进，在普通工厂模式中，如果传递的字符串出错，则不能正确创建对象，
 * 而多个工厂方法模式提供多个工厂方法，
 *
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
