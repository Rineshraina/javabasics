package com.logical.stable;

import java.util.Scanner;

public class WifiPin {
public void password(int roomNo,String name) {
	int a=roomNo%100;
	int b=a/10;
	
	String lastchar=name.substring(name.length() -1);
	
	int c=roomNo%10;
	char[]spl={'!','@','#','$','%','^','&','*','(',')'};
	
	int d=roomNo/100;
	int total=b+d+c;
	int x=total%10;
	int y=total/10;
	int z=x+y;
	
	System.out.println(z+""+spl[c]+lastchar+b);

	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the room no:");
	int roomNo=sc.nextInt();
	System.out.println("enter the name:");
	String name=sc.next();
	WifiPin wifi=new WifiPin();
	wifi.password(roomNo, name);
}
}
