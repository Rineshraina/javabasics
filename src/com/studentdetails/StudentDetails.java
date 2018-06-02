package com.studentdetails;

public class StudentDetails  {
private int studentId;
private String firstName;
private String secondName;
private String gender;
private String branch;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getSecondName() {
	return secondName;
}
public void setSecondName(String secondName) {
	this.secondName = secondName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
	

}
@Override
	public String toString() {
		
		return +studentId+","+firstName+""+secondName+","+gender+","+branch;
	}

}
