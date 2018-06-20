package guvi;

import java.util.Scanner;

public class Natural {

	public static void main(String[] args) {
		int sum=1;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=2;i<=num;i++) {
			sum=sum+i;
			
			
		}
		System.out.println(sum);
	}
}
