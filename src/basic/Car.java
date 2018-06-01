package basic;

class Car {
	
	
	    public int gear;
	    public int speed;
	         
	   
	    public Car(int gear, int speed)
	    {
	        this.gear = gear;
	        this.speed = speed;
	    }
	         
	   
	    public void applyBrake(int decrement)
	    {
	        speed -= decrement;
	    }
	         
	    public void speedUp(int increment)
	    {
	        speed += increment;
	    }
	     
	    // toString() method to print info of Bicycle
	    public String toString() 
	    {
	        return("No of gears are "+gear
	                +"\n"
	                + "speed of bicycle is "+speed);
	    } 
	}
	 
	// derived class
	class Taxi extends Car{  
	   
	    public int seatHeight;
	 
	   
	    public Taxi(int gear,int speed,
	                        int startHeight)
	    {
	        
	        super(gear, speed);
	        seatHeight = startHeight;
	    } 
	         
	    
	    public void setHeight(int newValue)
	    {
	        seatHeight = newValue;
	    } 
	     
	    // overriding toString() method
	    
	    @Override
	    public String toString()
	    {
	        return (super.toString()+
	                "\nseat height is "+seatHeight);
	    }
	     
	
	 
	// driver class
	}
	class Test{
	    public static void main(String args[]) 
	    {
	         
	        Taxi mb = new Taxi(5, 180, 20);
	        System.out.println(mb.toString());
	             
	    }}
	


