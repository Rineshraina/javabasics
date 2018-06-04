package com.profile;

public  class RineshProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstant.FIRST_NAME+"rinesh");
		System.out.println(ProfileConstant.LAST_NAME+"raina");
		System.out.println(ProfileConstant.AGE+"20");
		
	}

	@Override
	public void myHobbies() {
		System.out.println("My Hobbies:");
		System.out.println("gaming\nsinging\nplaying cricket");
		
	}
	

}


	
	

