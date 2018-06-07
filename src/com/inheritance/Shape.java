package com.inheritance;

public abstract class Shape {
	
	
		 
	    private double x, y; 
	     
	 
	public Shape( double x, double y ) {
	     
	    this.x = x;
	    this.y = y; } 
	 
	 
	public void setX( double x ) {
	 
	        this.x = x; } 
	 
	public double getX() {
	 
	        return x; }
	 
	 
	public void setY( double y ) {
	     
	    this.y = y; } 
	 
	public double getY() {
	 
	    return y; } 
	 
	 
	public String toString() {
	     
	    return String.format("Area"); }
	 
	 
	public abstract String getName();  
	 
	 
}
	

