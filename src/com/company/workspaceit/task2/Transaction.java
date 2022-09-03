package com.company.workspaceit.task2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public  class Transaction {
    private static int lastTransactionId=2000;
    private int transactionId;
    private String transactionDate;
    private String transactionTime;
    private String transactionType;
    private int transactionAmount;
    private int balance;

    public void createTransaction(String transactionType, int transactionAmount, int balance){
        this.transactionId=++lastTransactionId;
        this.transactionType=transactionType;
        this.transactionAmount=transactionAmount;
        this.balance=balance;

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDateTime=dateTime.format(time);
        this.transactionTime=formattedDateTime;
        formattedDateTime=dateTime.format(date);
        this.transactionDate=formattedDateTime;
    }

    public  int getTransactionId() {
        return transactionId;
    }

    public  void setTransactionId(int transactionId) {
      this.transactionId=transactionId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "Transaction Id: " + transactionId + '\n' +
                "Transaction Date: " + transactionDate + '\n' +
                "Transaction Time: " + transactionTime + '\n' +
                "Transaction Type: " + transactionType + '\n' +
                "Transaction Amount: " + transactionAmount + '\n' +
                "Balance: " + balance + '\n' ;
    }
}
