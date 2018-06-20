package com.logical.stable;
import java.util.Scanner;
public class DuplicateCount {
		public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[N];
		for(int m=0;m<N;m++)
		{
		arr[m]=s.nextInt();
		}
		int c=0;
		int n=findFirst(arr);
		for(int k=0;k<arr.length;k++)
		{
		if(n==arr[k])
		{
		c++;
		}
		
		}
		System.out.println(n+" "+c);
		}
		public static int findFirst(int[] arr){
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]==arr[j])
			{
			return arr[i];
		}
		}
		}
		return 0;		
		}
		}
