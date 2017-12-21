package oop;
            // This allows for inheritence from the BankAccount class

public class CDAccount extends BankAccount {
	
	String interestRate;
	
	void compound() {
		System.out.println("Compounding interest");
		
	}

}
