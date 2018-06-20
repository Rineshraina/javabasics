package guvi;

import java.util.Scanner;

public class BetweenPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
	       int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (i = start+1; i < end; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	      
	       System.out.println(primeNumbers);
	   
	}

}
