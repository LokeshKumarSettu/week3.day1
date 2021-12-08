package org.college;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("stu name: lokesh");

	}
	
	public void studentDept() {
		
		System.out.println("stu dept: mech");

	}
	
	public void studentId() {
		
		System.out.println("stu Id: 412317114019");
		
	}
	
	public static void main(String[] args) {
		
		Student details = new Student();
		
		details.collegeName();
		details.collegecode();
		details.collegeRank();
		
		details.deptName();
		
		details.studentId();
		details.studentName();
		details.studentDept();
		
	}

}
