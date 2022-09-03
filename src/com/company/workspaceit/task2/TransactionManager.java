package com.company.workspaceit.task2;

public class TransactionManager {


    public void withdraw(User user, int amount){
        if(user.getBalance()-amount>=500){
            user.setBalance(user.getBalance()-amount);
            System.out.println("Withdraw successfull!");
        }else{
            System.out.println("Insufficient funds. You must have taka 500 leftover in your account");

        }
        System.out.println("Your current balance: "+user.getBalance());
    }

    public void deposit(User user, int amount){

    }
}
