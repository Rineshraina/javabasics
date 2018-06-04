package com.profile;

public class MyFriendProfile implements IProfile {
	@Override
	public void myBasicInfo() {
		String firstname="suresh";
		String lastname="raina";
		int age=20;
		System.out.println("Name:"+firstname+""+lastname+"\nAge:"+age);
	}

	@Override
	public void myHobbies() {
		System.out.println("My Hobbies:");
		System.out.println("gaming\nreading\nplaying football");
		
	}
	
}
