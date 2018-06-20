package com.java.util;

public class Student {
	int regNo;
	String name;
	int mark;
	
	public Student(int regNO,String name,int mark) {
this.regNo=regNO;
this.name=name;
this.mark=mark;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
@Override
public String toString() {
	return regNo +"="+name+"="+mark;
	}
}
