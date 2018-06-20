package guvi;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = number;
		int a = 0;
		int X;
		while(number>0)
			
		{
		X=number%10;
		a= a*10 + X;
		number= number/10;
		}
		if(temp==a)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
