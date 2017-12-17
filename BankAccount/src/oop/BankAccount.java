package oop;

public class BankAccount {
    //Define variables
	
	String account;
	/* This value belongs to the class, BANK ACCOUNT, not the object instance; its predefined.
	 its used as a shared variable for objects. In this case the routing number doesn't change 
	 for any of the accounts. 
	 final means can't be changed outside the class.*/  
	static final String routing= "015772069";
	String name;
	String ssn;
	String acctype;
	
	//Constructor definitions: unique methods
		// 1. They are used to define / setup/ initalize properties of an object
	    // 2. Constructors are implicitly called upon instantiation
	   //  3. The same name as the class itself
	   // 4. Constructors have NO return type
	
	//Examples of Overloading; same constructors but Java can differentiate which one to use based
	// on arguements sent in
	BankAccount() {
		System.out.println("New Account created"); 
		
	}
	// Overloading: call same method with different arguements
	BankAccount(String acctype){
		System.out.println("NEW ACCOUNT: " + acctype);
	}
	BankAccount(String acctype, double initDeposit){
		System.out.println("NEW ACCOUNT: " + acctype );
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
	}
	
	
	//Define methods
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}
}