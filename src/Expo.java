package guvi;

import java.util.Scanner;

public class Expo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int result=  (int) Math.pow(num1, num2);
		System.out.println(result);
	}

}
