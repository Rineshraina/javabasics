package guvi;

import java.util.Scanner;

public class Amstrong extends Count {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int count = 1;
	int total=0;

	for(int i=0;i<num;i++)
	{
		num=num/10;
		if(num==0) {
			break;
		}
		else
			count++;
	}
	
	
	while (num != 0)
    {
        int temp = num % 10;
        total = (int) (total + Math.pow(temp, count));
        num /= 10;
    }

    if(total == num)
        System.out.println( "no");
    else
        System.out.println("yes");
}
}

