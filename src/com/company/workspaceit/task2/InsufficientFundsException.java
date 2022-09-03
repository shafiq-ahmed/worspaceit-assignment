package com.company.workspaceit.task2;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Insufficient funds in account for withdrawal");
    }
}
