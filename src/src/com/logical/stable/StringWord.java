package com.logical.stable;

import java.util.Scanner;

public class StringWord {
	public static void main(String[] args)  {  
	    int c=0,a,temp;  
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    temp=n; 
	    int b=(int)(Math.log(n)+1);
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(int)(Math.pow(n, b));  
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	   }  
	}  
		/*public static int getLetterNo(char letter){
		return (int)letter-64;
		}

		public static int diffLetter(int a, int b){
		int difference=a-b;
		if(difference<0)
		    difference*=-1;
		return difference;
		}

		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		char ch1,ch2;
		int counter;
		int center;
		int num1,num2;
		int sum=0;
		int output=0;
		String[] words=input1.toUpperCase().split("\\s");
		String totall="";

		for(String w:words){
		    counter=0;
		    center=w.length()/2;
		    sum=0;
		    while(counter<center){
		        ch1=w.charAt(counter);
		        ch2=w.charAt(w.length()-counter-1);
		        counter++;
		        num1=getLetterNo(ch1);
		        num2=getLetterNo(ch2);
		        sum+=diffLetter(num1,num2);
		    }
		    if(w.length()%2!=0)
		        sum+=getLetterNo(w.charAt(center));
		    totall+=sum;
		}
		output=Integer.valueOf(totall);


		System.out.println(output);    
		}

		}*/

