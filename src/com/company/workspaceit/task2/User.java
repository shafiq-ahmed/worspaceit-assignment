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

    public User(int accountNumber, String name, int initialDeposit, String password) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = initialDeposit;
        this.password = password;
    }

    @Override
    public String toString() {
        return  "accountNumber=" + accountNumber + '\n' +
                "name='" + name + '\n' +
                "balance=" + balance +'\n' +
                "password='" + password + '\n' +
                "transactionHistory=" + transactionHistory +
                '}';
    }
}
