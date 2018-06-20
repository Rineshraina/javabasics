package guvi;

import java.util.Scanner;

public class Count {

	public static void main  (String [] args)
	{
		int count = 1;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			num=num/10;
			if(num==0) {
				break;
			}
			else
				count++;
		}
				
			System.out.println(count);
				
	}
}
