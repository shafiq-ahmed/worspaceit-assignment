package com.company.workspaceit.task2;

public abstract class Transactions {
    private static int transactionId=0;
    private String transactionDate;
    private String transactionTime;
    private String transactionType;

    public abstract void deposit(int amount);
    public abstract void withdraw(int amount);
    public void transfer(int amount, User user){

    }
}
