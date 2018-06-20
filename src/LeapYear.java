package guvi;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	
System.out.println("Enter the year");
	Scanner sc = new Scanner(System.in);
	int Year = sc.nextInt();
	if(Year%4==0)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("No");
	}
}
}
