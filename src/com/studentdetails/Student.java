package com.studentdetails;

public class Student {
	public static void main(String[] args) {
		StudentDetails studentOne=new StudentDetails();
		studentOne.setStudentId(1);
		studentOne.setFirstName("rinesh");
		studentOne.setSecondName("raina");
		studentOne.setGender("male");
		studentOne.setBranch("Information technology");
		
		Student s = new Student();
		s.print(studentOne);
		
		
	}
	
	public void print(StudentDetails studentOne) {
		
		System.out.println(studentOne);
	}

}
