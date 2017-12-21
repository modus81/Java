package studentDB;

public class studentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Main stud1 = new Main();     
     stud1.userID(44566, 400522926);
	 stud1.NewStudent("MikeThomson", 324862926);
	 stud1.enroll();
	 stud1.checkBalance(3000);
	 stud1.showCourse();
	 
	 System.out.println(stud1.toString());
	 
	 //need to add getters and setters for things set to private
	}

}
