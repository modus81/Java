package studentDB;

import java.util.Date;
import java.util.Random;

/*- New Student constructor that takes name and SSN in the arguments
- Automatically create an email ID based on the name
- Set a private static ID
- Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
- Use encapsulation to set variables (phone, city, state)*/
public class Main {
	String name;
	String userID;
	String email;
	int phnNumber;
	String city;
	String state;	
    
	public static void main(String[] args) {
		
	}
	
	 public String NewStudent (String Name, int ssn){
		 //email is created with the name and concat with @SDET.edu	
	   email = (Name +"@Sdet.edu");
	   System.out.println(email); 
	   return email = (Name +"@Sdet.edu");   
	   		 
		 
	 }
	 
	 //Private ID ; unsure of what this is supposed to be
	 private static void ID (){
		 Random rand = new Random();
		 int value = rand.nextInt(2000) + 1000;
		
	 }
	 
	 public String userID(int privateID,int ssn){
		 Random rand = new Random();
		 int value = rand.nextInt(9000) + 1000;
		 privateID= 2;
		 String rando = Integer.toString(value);
		 String priv = Integer.toString(privateID);
		 String social = Integer.toString(ssn).substring(5, 9);
		 String UserID =  rando + priv + social;	
		 userID = UserID;
		 System.out.println(UserID);
		 return UserID;
		 
	 }
	 
	 public String enroll(){
		  Date date = new Date();
		  System.out.println(date.toString());
		  return date.toString() ;
	 }
	 public int checkBalance(int amountPaid){
		 int tuition = 3500;
		 int balance = tuition - amountPaid  ;	
		 System.out.println(balance);
		 return balance;
	 }
	 public void showCourse(){
		 System.out.println("English"+"Science"+ "Math");
		 
	 }
	 
	 @Override // an annotation that overrides to use this and not another toString metho
     // toString turns an object into a string
      public String toString() {
     return "[" + name + ". " + email + "." + userID + "]";	}


		 
	 

}
