package com.company.workspaceit.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*TODO
1. Validate all empty string inputs
2. validate minimum string length
* */
public class Bank {
    private static int totalUsers=0;
    private static List<User> users=new ArrayList<User>(5);
    private static TransactionManager transactionManager= new TransactionManager();

    public void startProcess(){
        String userInput="";

        Scanner scanner = new Scanner(System.in);
        while(!userInput.equals("0")) {
            System.out.println("Select operation: 1.Bank Operations  2.User Operations  0.Exit");
            userInput = scanner.nextLine();
            if (userInput.equals("1")) {
                System.out.println("here 1");
                bankOperations();
            } else if (userInput.equals("2")) {
                userOperations();
            } else if(userInput.equals("0")){
                break;
            }else {
                System.out.println("Invalid input");
            }
        }

    }

    public void bankOperations(){
        String userInput="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here 2");
        while(!userInput.equals("0")) {
            System.out.println("Here 3");
            System.out.println("Select operation: 1.Add user  2.Print all users   0.Exit");
            userInput = scanner.nextLine();
            if (userInput.equals("1")) {
                addUser();
            } else if (userInput.equals("2")) {
                printAllUsers();
            } else if (userInput.equals("0")) {
                break;
            }else {
                System.out.println("Invalid Input");
            }
        }
    }
    public void userOperations(){
        String userInput="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user account number: ");
        userInput=scanner.nextLine();
        User user=getUser(Integer.parseInt(userInput));
        if(user!=null){
            System.out.println("Enter user account password: ");
            userInput=scanner.nextLine();
            if(passwordIsValid(user,userInput)){

                while(!userInput.equals("0")) {
                    System.out.println("Select operation: 1.Withdraw  2.Deposit   0.Exit");
                    userInput = scanner.next();
                    if (userInput.equals("1")) {
                        makeWithdrawal(user);
                    } else if (userInput.equals("2")) {
                        makeDeposit(user);
                    } else if (userInput.equals("0")) {
                        break;
                    }else {
                        System.out.println("Invalid Input");
                    }
                }
            }else{
                System.out.println("Password is incorrect");
            }

        }else{
            System.out.println("Account number does not exist");
        }

    }

    public void addUser(){
        Scanner scanner= new Scanner(System.in);
        String name;
        String password;
        int deposit;

        System.out.println("Enter name: ");
        name=scanner.nextLine();
        System.out.println("Enter deposit: ");
        deposit=scanner.nextInt();
        scanner.nextLine();//to consume the newline
        System.out.println("Enter password: ");
        password=scanner.nextLine();

        User user= new User(generateAccountNumber(),name,deposit,password);
        users.add(user);
        totalUsers++;
        System.out.println("User entry successfull");
        System.out.println(user);

    }

    public int generateAccountNumber(){
        if(totalUsers<=0){
            return 1001;
        }else {
          int accountNumber= users.get(users.size()-1).getAccountNumber();
          return ++accountNumber;
        }
    }
    public void printAllUsers(){
        for(int i=0;i<users.size();i++){
            System.out.println(users.get(i));
        }
    }

    public User getUser(int accountNumber){
        User user;
        for(int i=0;i<users.size();i++){
            user=users.get(i);
            if(user.getAccountNumber()==accountNumber){
                return user;
            }
        }
        return null;
    }
    public boolean passwordIsValid(User user, String password){
       return user.getPassword().equals(password);
    }
    public void makeWithdrawal(User user){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn: ");
        int amount=scanner.nextInt();
        transactionManager.withdraw(user,amount);

    }
    public void makeDeposit(User user){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter amount to deposit: ");
        int amount=scanner.nextInt();
        transactionManager.deposit(user,amount);

    }
}
