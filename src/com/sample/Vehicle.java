package com.sample;

public abstract class Vehicle implements Travel {
	  
}	
	 class Car extends Vehicle{
		
		@Override
		public String toString() {
			return "280";
		}

		@Override
		public void getspeed() {
			
		}
	}
	 class Cycle extends Vehicle {
		@Override
		public void getspeed() {	
		}
		@Override
		public String toString() {
			return "150";	}
	}
	 class Bus extends Vehicle {
		@Override
		public void getspeed() {	
		}
		@Override
		public String toString() {
			return "100";
		}
	}
	 


