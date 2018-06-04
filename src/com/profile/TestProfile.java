package com.profile;

public class TestProfile {
	public static void printprofile(IProfile profile) {
		profile.myBasicInfo();
		profile.myHobbies();
		
	}
public static void main(String[] args) {
	IProfile myProfile=new RineshProfile();
	printprofile(myProfile);
	
	
}
}
