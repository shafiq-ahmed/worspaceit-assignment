package com.company.workspaceit.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private static int totalUsers=0;
    private static List<User> users=new ArrayList<User>(5);

    public void startProcess(){
        String userInput="";
        while(!userInput.equals("0")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select operation: 1.Add user  2.Print all users 0.Exit");
            userInput = scanner.next();
            if (userInput.equals("1")) {
                addUser();
            } else if (userInput.equals("2")) {
                printAllUsers();
            }
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

    }

    public int generateAccountNumber(){
        return totalUsers++;
    }
    public void printAllUsers(){
        for(int i=0;i<users.size();i++){
            System.out.println(users.get(i));
        }
    }
}
