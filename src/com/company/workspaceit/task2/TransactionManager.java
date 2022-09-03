package com.company.workspaceit.task2;

public class TransactionManager {


    public boolean withdraw(User user, int amount) throws InsufficientFundsException {
        if (user.getBalance() - amount >= 500) {
            user.setBalance(user.getBalance() - amount);
            Transaction transaction = new Transaction();
            transaction.createTransaction("Credit", amount, user.getBalance());
            user.addTransaction(transaction);
            return true;
        } else {
            throw new InsufficientFundsException();
        }

    }

    public boolean deposit(User user, int amount) {
        if (amount >= 500) {
            user.setBalance(user.getBalance() + amount);
            Transaction transaction = new Transaction();
            transaction.createTransaction("Debit", amount, user.getBalance());
            user.addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }

    public void transfer(User ownerAccount, User receiverAccount, int amount) {
        try {
            if (withdraw(ownerAccount, amount)) {
                if (deposit(receiverAccount, amount)) {
                    System.out.println("Transfer successful");
                } else {
                    System.out.println("Minimum deposit amount is Tk.500 ");
                }
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}



