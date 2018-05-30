package basic8;

public class Car {
	public static void main(String[]args) {
		Object car3=new Object();
		car3.setSpeed(100);
		Car car=new Car();
		car.aMethod(car3);
		System.out.println("speed"+car3.getSpeed());
	}
	public void aMethod(Object car) {
		car.setSpeed(300);
	}

}
