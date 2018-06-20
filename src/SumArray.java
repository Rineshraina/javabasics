package guvi;

import java.util.Scanner;

public class SumArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		int k=sc1.nextInt();
		int t=1,j=0;
		int[] arr = new int[num];
		for (int i=0;i<num;i++)
		{
			if(i==0)
			{
				arr[i]=1;
			}
			else
			{
				
			   t+=1;
			   arr[i]=t;
				
			}
		}
		for(int i=0;i<k;i++)
		{
			j+=arr[i];
		}
		System.out.println(j);
		}
		
	}


