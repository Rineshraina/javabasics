package com.inheritance;

public  class ThreeDimension extends Shape{
	 
    private double Dimension1, Dimension2, Dimension3;
 
 
    public ThreeDimension(double x,double y, double dime1){
 
        super(x,y,dime1);
        Dimension1 = dime1;
        Dimension2 = x;
        Dimension3 = y; } 
     
     
    public void setDimension3(double dime3) {
     
        this.Dimension2 = dime3; } 
 
    public double getDimension3() { 
        return Dimension3;}
     
 
    public  double getArea() {
    	return Dimension1*Dimension2;
    }
  
    public  double getVolume() {
    	return Dimension1*Dimension2*Dimension3;
    }
 
}
