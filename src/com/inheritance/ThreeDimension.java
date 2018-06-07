package com.inheritance;

public abstract class ThreeDimension extends Shape{
	 
    private double Dimension1, Dimension2, Dimension3;
 
 
    public ThreeDimension(double x, double y, double dime1, double dime2, double dime3 ){
 
        super( x, y );
        Dimension1 = dime1;
        Dimension2 = dime2;
        Dimension3 = dime3; } 
     
     
    public void setDimension3(double dime3) {
     
        this.Dimension2 = dime3; } 
 
    public double getDimension3() { 
        return Dimension3;}
     
 
    public abstract double getArea();
  
    public abstract double getVolume();
 
}
