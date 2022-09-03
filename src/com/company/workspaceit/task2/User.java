package com.company.workspaceit.task2;

import java.util.ArrayList;
import java.util.List;

public class User {
    public int getAccountNumber() {
        return accountNumber;
    }

    private int accountNumber;
    private String name;
    private int balance;
    private String password;
    private List<String> transactionHistory= new ArrayList<>(3);

    public User(int accountNumber, String name,  String password) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.password = password;
    }

    public void addTransaction(Transaction transaction){
        transactionHistory.add(transaction.toString());
    }
    @Override
    public String toString() {
        return  "AccountNumber= " + accountNumber + '\n' +
                "Name= " + name + '\n' +
                "Balance= " + balance +'\n' +
                "Password= " + password + '\n'

                ;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List<String> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }
}
