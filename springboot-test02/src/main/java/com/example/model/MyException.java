package com.example.model;

/**
 * 自定义异常类
 */
public class MyException extends Exception {
    private double amount; // 此处的amount用来存储当出现异常(当取出的钱少于余额)时所缺乏的钱

    public MyException(double amount, String message) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }
}

class CheckingAccount {
    private double balance; // 账户余额
    private Long cardId;

    public CheckingAccount(Long number) {
        this.cardId = number;
    }

    // 存钱
    public void deposit(double money) {
        this.balance += money;
    }

    // 取钱
    public void withdraw(double money) throws MyException {
        if (money > this.balance) {
            throw new MyException(money - this.balance, "温馨提示：您的余额不足，请存钱!");
        } else {
            this.balance -= money;
        }
    }

    public double getBalance() {
        return balance;
    }

    public Long getCardId() {
        return cardId;
    }

    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(7890921738131L);
        checkingAccount.deposit(10000); // 存1万块钱
        try {
            checkingAccount.withdraw(11000); // 取一万1
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("抱歉，您的银行卡余额不足，请补交" + e.getAmount() + "元钱！");
        }
        System.out.println("程序结束...");
    }
}