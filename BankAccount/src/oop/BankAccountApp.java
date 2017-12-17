package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account
		
		BankAccount acc1 = new BankAccount();
		acc1.account = "0115233";
		//Using Encapsulation: public API methods /Section 3 Lecture 22
		acc1.setName( "Roger Hue");
		System.out.println(acc1.getName());
		acc1.balance = 10000.0;
		System.out.println(acc1.toString());
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
	
		
		/*
		BankAccount acc2 = new BankAccount("Checking");
		BankAccount acc3 = new BankAccount("Savings", 12344);
        acc3.account = "0115333";        
		acc3.checkBalance();
		
		// The BankAccount has been extended to CDAccount and 
		//an obj has been created to use an inherited method
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000.0;
		cd1.interestRate = "4.5";
		cd1.name= "Juan";
		cd1.account = "CD Account";
		cd1.compound();
		
		System.out.println(cd1.toString());*/
		
		
		
		
	}

}
