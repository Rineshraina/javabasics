package guvi;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		if(num>0 && num<=1000)
		{
			if(num%2==0) {
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}
		else
		{
			System.out.println("invalid");
		}
	}
	

}
