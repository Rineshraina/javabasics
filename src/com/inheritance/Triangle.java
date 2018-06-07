package com.inheritance;


public class Triangle extends TwoDimension{
    
    private double base;
    private double height;
     
    public Triangle( double x, double y, double base, double height){
         
        super(x, y, base, height);
         
        if(height <= 0.0){
             
            throw new IllegalArgumentException("Radius >= 0.0"); }
        else{
             
            this.base = base;
            this.height = height;
        }
    } 
     
    public void setBase(double base){
        if(base <= 0.0)
            throw new IllegalArgumentException("Base length > 0");
        this.base = base;
    }
    public double getBase(){
        return base;
    }
     
    public void setHieght(double hieght){
        if(hieght <= 0.0)
            throw new IllegalArgumentException("Hieght length > 0");
        this.height = hieght;
    }
     
    public double getHieght(){
        return height;
    }
     
    public double getArea(){
        return (getBase()*getHieght()/2);
    }
     
    @Override
    public String toString(){
        return String.format("%s = %.2f%n%19s = %.2f%n%17s = %.2f", "Base", getBase(), "Hieght", getHieght(),super.toString(), getArea());
    }
 
    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         
}
