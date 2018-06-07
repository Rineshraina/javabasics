package com.poly;

public class Poly {
	public static void main(String[] args) {
		Car car[]= {new Taxi(),new SportsCar(),new PoliceCar()};
		for (int i = 0; i < car.length; i++) {
			car[i].brake();
		}
	
	}
	

}
