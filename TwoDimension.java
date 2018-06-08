package com.inheritance;

public  class TwoDimension extends Shape {
	 
    double dimension1,dimension2;
 
     
    public TwoDimension( double x, double y ) {
 
        super(x,y);
        dimension1 = x;
        dimension2 = y; } 
    public TwoDimension( double x, double y ,double z) {
    	 
        super(x,y,z);
        dimension1 = x;
        dimension2 = y; } 
   
    
     
     
   
	public void setDimension1(double x) {
     
        this.dimension1 = x; } 
 
 
    public double getDimension1() { 
        return dimension1; }  
 
     
    public void setDimension2(double y) {
     
        this.dimension2 = y; } 
 
 
    public double getDimension2() { 
        return dimension2;} 
     
     
    public  double getArea() {
    	return dimension1*dimension2;
    }
  
}
