package com.inheritance;

public  class Shape {
	Shape(){
		
	}
	public Shape(double x,double y){
		 System.out.println(x*y);
		 
	 }
	
	public Shape(double x,double y,double z){
		 System.out.println(x*y*z);
		 
	 }
	
	
	public void area() {
		System.out.println("area of all shapes");
	}
	public String getName(String shapes) {
		
		return shapes;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
      public  double getVolume() {
    	  double volume = 0;
		return volume;
      }
	
	

}