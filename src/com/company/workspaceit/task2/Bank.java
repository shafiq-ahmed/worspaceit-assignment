package com.company.workspaceit.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private int totalUsers;
    private static List<User> users=new ArrayList<User>(5);

    

    public void addUser(){
        Scanner scanner= new Scanner(System.in);
        String name;
        String password;
        int deposit;

        System.out.println("Enter name: ");
        name=scanner.nextLine();
        System.out.println("Enter deposit: ");
        deposit=scanner.nextInt();
        System.out.println("Enter password: ");
        password=scanner.nextLine();

        User user= new User(generateAccountNumber(),name,deposit,password);

    }

    public int generateAccountNumber(){
        if(totalUsers<=0){
            return 1;
        }else{
            return users.size();
        }
    }
    public void printAllUsers(){
        for(int i=0;i<users.size();i++){
            System.out.println(users.get(i));
        }
    }
}
