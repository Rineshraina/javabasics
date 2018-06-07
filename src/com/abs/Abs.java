package com.abs;

public abstract class Abs {
	Abs(){
		System.out.println("abstrat class");
	}
public abstract void getitem();

public static void main(String[] args) {
	Subabs abs=new Subabs();
	abs.getitem();
	
}

}
class Subabs extends Abs{

	@Override
	public void getitem() {
		System.out.println("abstrat class");
	}
	
	
}