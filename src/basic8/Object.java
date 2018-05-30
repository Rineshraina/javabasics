package basic8;

public class Object {
private String model;
private double speed;
public Object() {
	
}
 
public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public double getSpeed() {
	return speed;
}

public void setSpeed(double speed) {
	this.speed = speed;
}

public boolean start() {
	return true;
}
public void accelerate() {
	speed+=10;
	
}
public static void main(String[]args) {
	Object car1=new Object();
	Object car2=new Object();
	car1.speed=20.0;
	car2.speed=30.0;
	System.out.println(car1.speed);
	System.out.println(car2.speed);
}
}
