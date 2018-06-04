package com.sample;

public abstract class Animal implements Travel {

}
	class Cat extends Vehicle {
		@Override
		public void getspeed() {
			}
		@Override
		public String toString() {
			return "120";
		}
	}
	 class Dog extends Vehicle {
		@Override
		public void getspeed() {	
			}
		@Override
		public String toString() {
			return "100";
		}
	}
	class Lion extends Vehicle {
		@Override
		public void getspeed() {
		}
		@Override
		public String toString() {
			return "80";
		}
	}



