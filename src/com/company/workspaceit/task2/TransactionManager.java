package com.company.workspaceit.task2;

public class TransactionManager {


    public void withdraw(User user, int amount){
        if(user.getBalance()-amount>=500){
            user.setBalance(user.getBalance()-amount);
            System.out.println("Withdraw successfull!");
            Transaction transaction=new Transaction();
            transaction.createTransaction("Credit",amount, user.getBalance());
            user.addTransaction(transaction);
        }else{
            System.out.println("Insufficient funds. You must have taka 500 leftover in your account");

        }
        System.out.println("Your current balance: "+user.getBalance());
    }

    public void deposit(User user, int amount){
        if(amount>=500){
            user.setBalance(user.getBalance()+amount);
            System.out.println("Deposit successfull! \nYour current balance: "+user.getBalance());
            Transaction transaction=new Transaction();
            transaction.createTransaction("Debit",amount, user.getBalance());
            user.addTransaction(transaction);
        }else{
            System.out.println("Minimum deposit amount is Tk.500 ");
        }
    }
}
