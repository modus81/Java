package oop;

public class BankAccount {
    //Define variables
	
	String account;
	/* This value belongs to the class, BANK ACCOUNT, not the object instance; its predefined.
	 its used as a shared variable for objects. In this case the routing number doesn't change 
	 for any of the accounts. 
	 final means can't be changed outside the class.*/  
	private static final String routing= "015772069";
	
	//instance variables
	
	private String name;
	String ssn;
	String acctype;
	Double balance = 0.0;
	
	//Constructor definitions: unique methods
		// 1. They are used to define / setup/ initalize properties of an object
	    // 2. Constructors are implicitly called upon instantiation
	   //  3. The same name as the class itself
	   // 4. Constructors have NO return type
	
	//Examples of Overloading; same constructors but Java can differentiate which one to use based
	// on arguments sent in
	BankAccount() {
		System.out.println("New Account created"); 
		
	}
	// Overloading: call same method with different arguements
	BankAccount(String acctype){
		System.out.println("NEW ACCOUNT: " + acctype);
	}
	BankAccount(String acctype, double initDeposit){
		//acctype and initDeposit are local variables
		System.out.println("NEW ACCOUNT: " + acctype );
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000 ) {
		    Msg = "ERROR: Minimum deposit must be at least $1,000";			
		} else {
			 Msg = "Thanks for your deposit of: $" + initDeposit;
		}
		 System.out.println(Msg);
		 balance = initDeposit;
	}
	
	//Getters / Setters /Section 3 Lecture 22
	// Allow users to define the name although it is set to private
    public void setName (String name){
    	this.name = name;
    }
	public String getName(){
		return name;
	}
    
	
	//Define methods
	
	
	//Public means its available to anything in the project
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	// the default makes this available to anything in the package same as protected
	void withdraw(double withdraw) {
		balance =  balance - withdraw;
		showActivity("WITHDRAW");
		
	}
	
	// private  means only available within the class	
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS : $ " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance is  : " + balance);
	}
	
	void getStatus() {
		
	}
	@Override // an annotation that overrides to use this and not another toString metho
	          // toString turns an object into a string
	public String toString() {
		return "[" + name + ". " + account + ". Balanace: $ " + balance + "]";	}
	
}