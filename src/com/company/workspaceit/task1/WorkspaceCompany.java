package com.company.workspaceit.task1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class WorkspaceCompany {
    private static List<Employee> Employees= new ArrayList<Employee>(5);
    private static int totalEmployees=0;

    public void StartProcess(){
        String userInput="";
        while(!userInput.equals("3")) {
            System.out.println("Select operation: 1.Add Employee  2.Print Employee Information 3.Exit");
            Scanner scanner = new Scanner(System.in);
            userInput = scanner.next();
            if(userInput.equals("1")){
                addEmployee();
            }else if(userInput.equals("2")){
                printEmployees();
            }else if(userInput.equals("3")){
                break;
            }else System.out.println("Invalid Input");

        }
    }

    public void addEmployee(){
        Scanner scanner=new Scanner(System.in);
        String userInput="";
        String empName="";
        int empSalary=0;

        System.out.print("Employee name: ");
        empName= scanner.nextLine();
        if(empName.isBlank()){
            System.out.println("Invalid input");
            return;
        }else if(empName.length()<3){
            System.out.println("Name must be at least 3 characters");
            return;
        }
        System.out.print("Employee Salary: ");
        try{
            empSalary= scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Invalid Input");
            return;
        }
        if(empSalary<=0){
            System.out.println("Invalid amount");
            return;
        }


        System.out.println("Please select a type for this Employee: 1.Permanent  2.Temporary  3.Contractual ");
        userInput = scanner.next();
        if(userInput.equals("1")){
            Employee emp=new PermamentEmployee();
            scanner.nextLine();//to consume the newline
            setEmployee(empName,empSalary,emp);

        }else if(userInput.equals("2")){
            Employee emp=new TemporaryEmployee();
            scanner.nextLine();//to consume the newline
            setEmployee(empName,empSalary,emp);
        }else if(userInput.equals("3")){
            Employee emp=new ContractualEmployee();
            scanner.nextLine();//to consume the newline
            setEmployee(empName,empSalary,emp);
        }
        }


    public void printEmployees(){
        if(totalEmployees<=0){
            System.out.println("There are no employees in this company");
            return;
        }
        Applicable applicable;
        Employee emp= new Employee();
        for (int i = 0; i < totalEmployees; i++) {
            applicable=(Applicable) Employees.get(i);
            emp = Employees.get(i);
            System.out.println("Name: " + emp.getName());
            System.out.println("ID: " + emp.getId());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Employee Type: " + emp.getEmployeeType());
            System.out.println("Eid bonus: " + applicable.getBonus());
            System.out.println("Emplyee is eligible for providend fund: " + applicable.isEligibleForProvidentFund());
            System.out.println();
        }
    }

    public void setEmployee(String name, int salary, Employee emp){

        emp.setName(name);
        emp.setSalary(salary);
        emp.setId(++totalEmployees);
        Employees.add(emp);
    }
}
