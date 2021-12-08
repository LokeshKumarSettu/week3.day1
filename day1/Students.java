package week3.day1;

public class Students {
	
	public void getStudentInfo(int ID) {
		System.out.println("student id:" + ID);
		
	}
	
    public void getStudentInfo(int ID , String name ) {
		
	System.out.println("student id :" +ID+ " student name :" + name);
	}

    public void getStudentInfo(String email , long phno) {
	
	System.out.println("email id :" + email + " student number :" + phno);
}


    public static void main(String[] args) {
		
    	
    	Students stu = new Students();
    	stu.getStudentInfo(4019);
    	stu.getStudentInfo(4019, "lokesh");
    	stu.getStudentInfo("slokesh@gmail.com", 234343555);
	}
}
