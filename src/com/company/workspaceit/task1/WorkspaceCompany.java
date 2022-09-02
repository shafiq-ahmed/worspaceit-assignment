package com.company.workspaceit.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkspaceCompany {
    List<Employee> Employees= new ArrayList<Employee>(5);
    private static int totalEmployees=0;

    public void StartProcess(){
        String userInput="";
        System.out.println("hello");
        while(!userInput.equals("3")) {
            System.out.println("Select operation: 1.Add Employee  2.Print Employee Information 3.Exit");
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.next();
            if(userInput.equals("1")){
                addEmployee();
            }else if(userInput.equals("2")){
                printEmployees();
            }else if(userInput.equals("3")){

            }else System.out.println("Invalid Input");

        }
    }

    public void addEmployee(){
        Scanner scanner=new Scanner(System.in);
        String userInput="";
        while(!userInput.equals("0")){

            System.out.println("Please select a type of Employee: 1.Permanent  2.Temporary  3.Contractual or 0.Exit");
            userInput = scanner.next();
            if(userInput.equals("1")){
                String empName="";
                int empSalary=0;
                Employee emp=new PermamentEmployee();
                scanner.nextLine();//to consume the newline
                System.out.print("Employee name: ");
                empName= scanner.nextLine();
                System.out.print("Employee Salary: ");
                empSalary= scanner.nextInt();
                emp.setName(empName);
                emp.setSalary(empSalary);
                emp.setId(totalEmployees++);
                this.Employees.add(emp);
            }else if(userInput.equals("2")){

            }else if(userInput.equals("3")){

            }else if(!userInput.equals("0"))
                System.out.println("Invalid Input");
        }
    }

    public void printEmployees(){
        for (int i = 0; i < Employees.size(); i++)
            System.out.print(Employees.get(i) + " ");
    }
}
