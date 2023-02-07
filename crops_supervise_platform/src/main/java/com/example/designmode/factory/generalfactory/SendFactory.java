package com.example.designmode.factory.generalfactory;

/**
 * 工厂类
 *
 * @Author yuanyao
 * @Date 2023/2/2
 */
public class SendFactory {

    /**
     * 用于生产Sender
     */
    public Sender produce(String type) {
        if ("email".equals(type))
            return new MailSender();
        else if ("sms".equals(type))
            return new SmsSender();
        else {
            System.out.println("类型传入错误~");
            return null;
        }
    }
}
