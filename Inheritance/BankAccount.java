/*
Account class					
name,accno,balance				


Transaction interface
deposit(int),withdraw(int),displayBalance()

SavingsAccount is direct subclass of Account and Transaction

Accept details for single account and perform different transactions based on choice of user			
*/


import java.util.*;

class Account
{
	String name,accno;
	int balance;

	Scanner sc=new Scanner(System.in);

	public Account()
	{
		System.out.println("Enter customer name:");
		name=sc.next();

		System.out.println("Enter customer account number:");
		accno=sc.next();

		System.out.println("Enter balance:");
		balance=sc.nextInt();

	}
}

interface Transaction
{
	void deposit(int amt);
	void withdraw(int amt);
	void displayBalance();
}

class SavingsAccount extends Account implements Transaction
{
	public SavingsAccount()
	{
		super();
	}

	public void deposit(int amt)
	{
		balance=balance+amt;
	}

	public void withdraw(int amt)
	{
		if(balance>=amt)
		{
			balance=balance-amt;
		}

		else
		{
			System.out.println("insufficient balance");
		}
	}

	public void displayBalance()
	{
		System.out.println("The balance is "+balance);
	}

}

class Main
{
	public static void main(String args[])
	{
		SavingsAccount s=new SavingsAccount();
		int option,amt;
		Scanner sc=new Scanner(System.in);

		do
		{
			System.out.println("Enter choice...1. withdraw    2. deposit      3. display balance");
			option=sc.nextInt();
			switch(option)
			{
				case 1: System.out.println("Enter amount to be withdrawn:");
					amt=sc.nextInt();
					s.withdraw(amt);
					break;


				case 2: System.out.println("Enter amount to be deposited:");
					amt=sc.nextInt();
					s.deposit(amt);
					break;

				case 3:s.displayBalance();
					break;

				default:System.out.println("Invalid choice");


			}

			System.out.println("Do you want to continue...1.Yes    2. No:");
			option=sc.nextInt();
		}while(option==1);

	}

}
