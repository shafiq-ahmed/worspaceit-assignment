package com.company.workspaceit.task2;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Insufficient funds. Tk.500 must remain after withdrawal");
    }
}
