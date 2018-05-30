package basic8;

public class Object {
String model;
double speed;
public Object() {
	
}
public boolean start() {
	return true;
}
public void accelerate() {
	
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
