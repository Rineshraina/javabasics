package guvi;

import java.util.Scanner;

public class BetweenAmstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int total=0;
		 for (int i = start+1; i < end; i++)         
	       { 		  	  
	          int count=0; 	  
	          for(int num =i; num<end; num++) 
	        		{
	        			num=num/10;
	        			if(num==0) {
	        				break;
	        			}
	        			else
	        				count++;
	        		}
	        		
	     	 for (int i1 = start+1; i1 < end; i1++)  {
	     		 
	     	 
	        		while (i1 != 0)
	        	    {
	        	        int temp = i1 % 10;
	        	        total = (int) (total + Math.pow(temp, count));
	        	        i1 /= 10;
	        	        
	        	    

	        	    if(total == i1)
	        	    {
	        	 System.out.println(i1);
	        	}

	        	    }
	        	 
	     	 }
	       }
}
}
