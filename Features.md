##Task 1 Features

<pre>
No employee validation
Select operation: 1.Add Employee  2.Print Employee Information 3.Exit
2
There are no employees in this company


Name validation
Select operation: 1.Add Employee  2.Print Employee Information 3.Exit
1
Employee name: f
Name must be at least 3 characters


Salary input validaton
Select operation: 1.Add Employee  2.Print Employee Information 3.Exit
1
Employee name: sakib
Employee Salary: tttre
Invalid Input


Negative salary validation
Select operation: 1.Add Employee  2.Print Employee Information 3.Exit
1
Employee name: fahim
Employee Salary: -900
Invalid amount


3 types of employess
elect operation: 1.Add Employee  2.Print Employee Information 3.Exit
2
3
Name: rakib
ID: 1
Salary: 18000
Employee Type: Permanent
Eid bonus: 9000
Emplyee is eligible for providend fund: true

Name: fahim
ID: 2
Salary: 30900
Employee Type: Temporary
Eid bonus: 0
Emplyee is eligible for providend fund: false

Name: shafiq
ID: 3
Salary: 12900
Employee Type: Contractual
Eid bonus: 0
Emplyee is eligible for providend fund: false

</pre>


##Task 2 Features

<pre>
Invalid input for operation
Select operation: 1.Bank Operations  2.User Operations  0.Exit
erw
Invalid input
Select operation: 1.Bank Operations  2.User Operations  0.Exit
1
Select operation: 1.Add user  2.Print all users   0.Exit

**Blank input
Select operation: 1.Add user  2.Print all users   0.Exit

Invalid Input
Select operation: 1.Add user  2.Print all users   0.Exit


No users validation
Select operation: 1.Bank Operations  2.User Operations  0.Exit
1
Select operation: 1.Add user  2.Print all users   0.Exit
2
There are no users in the bank



Name validation
Select operation: 1.Add user  2.Print all users   0.Exit
1
Enter name:
r
Name must be at least 3 characters long
Select operation: 1.Add user  2.Print all users   0.Exit

**4Deposit amount inpu type validation
Select operation: 1.Add user  2.Print all users   0.Exit
1
Enter name:
rafiq
Enter deposit:
ttyu
Invlid input
Select operation: 1.Add user  2.Print all users   0.Exit


Blank password validation
Enter name:
rafiq
Enter deposit:
19000
Enter password:

Invalid Input
Select operation: 1.Add user  2.Print all users   0.Exit


User entry into system
Select operation: 1.Add user  2.Print all users   0.Exit
1
Enter name:
rafiq
Enter deposit:
19000
Enter password:
12tu
User entry successfull
AccountNumber= 1001
Name= rafiq
Balance= 19000
Password= 12tu

Select operation: 1.Add user  2.Print all users   0.Exit



Show all users
Select operation: 1.Bank Operations  2.User Operations  0.Exit
1
Select operation: 1.Add user  2.Print all users   0.Exit
2
AccountNumber= 1001
Name= rafiq
Balance= 19000
Password= 12tu

AccountNumber= 1002
Name= shafiq
Balance= 12000
Password= 1211

AccountNumber= 1003
Name= fahim
Balance= 99900
Password= qwer

Select operation: 1.Add user  2.Print all users   0.Exit

Exception for invalid amount withdrawn
Select operation: 1.Bank Operations  2.User Operations  0.Exit
2
Enter user account number:
1002
Enter user account password:
1200
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit
1
Enter amount to be withdrawn:
900
Insufficient funds. Tk.500 must remain after withdrawal
Your current balance: 1000
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit
com.company.workspaceit.task2.InsufficientFundsException: Insufficient funds. Tk.500 must remain after withdrawal
at com.company.workspaceit.task2.TransactionManager.withdraw(TransactionManager.java:14)
at com.company.workspaceit.task2.Bank.makeWithdrawal(Bank.java:194)
at com.company.workspaceit.task2.Bank.userOperations(Bank.java:81)
at com.company.workspaceit.task2.Bank.startProcess(Bank.java:31)
at com.company.workspaceit.task2.Main.main(Main.java:7)


Withdraw operation
Enter user account number:
1002
Enter user account password:
1200
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit
1
Enter amount to be withdrawn:
300
Withdraw successfull!
Your current balance: 700
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit


Minimum amount deposit validation
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit
2
Enter amount to deposit:
100
Minimum deposit amount is Tk.500
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit


Deposit operation
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit
2
Enter amount to deposit:
900
Deposit successfull!
Your current balance: 1600


Account number validation
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit
5
Enter receiver account number:
1900
Account does not exist

Transfer operation
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit
5
Enter receiver account number:
1001
Enter amount:
800
Transfer successful
Your current balance: 800


View Account details
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit
3
AccountNumber= 1002
Name= fahim
Balance= 800
Password= 1200


View transaction history with transaction type
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit
4
Transaction Id: 2002
Transaction Date: 04-09-2022
Transaction Time: 06:02:56
Transaction Type: Debit
Transaction Amount: 1000
Balance: 1000

Transaction Id: 2003
Transaction Date: 04-09-2022
Transaction Time: 06:04:33
Transaction Type: Credit
Transaction Amount: 300
Balance: 700

Transaction Id: 2004
Transaction Date: 04-09-2022
Transaction Time: 06:05:58
Transaction Type: Debit
Transaction Amount: 900
Balance: 1600


***Transaction recorded on both receiver and sender account history
Select operation: 1.Bank Operations  2.User Operations  0.Exit
2
Enter user account number:
1002
Enter user account password:
1211
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit
5
Enter receiver account number:
1001
Enter amount:
900
Transfer successful
Your current balance: 9500
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit
4
Transaction Id: 2002
Transaction Date: 04-09-2022
Transaction Time: 07:06:32
Transaction Type: Debit
Transaction Amount: 12000
Balance: 12000

Transaction Id: 2003
Transaction Date: 04-09-2022
Transaction Time: 07:06:51
Transaction Type: Credit
Transaction Amount: 1000
Balance: 11000

Transaction Id: 2004
Transaction Date: 04-09-2022
Transaction Time: 07:07:33
Transaction Type: Debit
Transaction Amount: 600
Balance: 11600

Transaction Id: 2005
Transaction Date: 04-09-2022
Transaction Time: 07:08:30
Transaction Type: Credit
Transaction Amount: 1200
Balance: 10400

Transaction Id: 2007
Transaction Date: 04-09-2022
Transaction Time: 07:09:45
Transaction Type: Credit
Transaction Amount: 900
Balance: 9500
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit
0
Select operation: 1.Bank Operations  2.User Operations  0.Exit
2
Enter user account number:
1001
Enter user account password:
were
Select operation: 1.Withdraw  2.Deposit  3.View Account Details  4.View transaction History  5.Transfer  0.Exit
4
Transaction Id: 2001
Transaction Date: 04-09-2022
Transaction Time: 07:06:03
Transaction Type: Debit
Transaction Amount: 12900
Balance: 12900

Transaction Id: 2006
Transaction Date: 04-09-2022
Transaction Time: 07:08:30
Transaction Type: Debit
Transaction Amount: 1200
Balance: 14100

Transaction Id: 2008
Transaction Date: 04-09-2022
Transaction Time: 07:09:45
Transaction Type: Debit
Transaction Amount: 900
Balance: 15000

</pre>>



