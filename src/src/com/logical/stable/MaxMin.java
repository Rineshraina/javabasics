package com.logical.stable;

import java.util.Scanner;

public class MaxMin {
	
		 
	    public void printTwoMaxNumbers(int[] nums){
	        int maxOne = 0;
	        int maxTwo = 0;
	        for(int n:nums){
	            if(maxOne < n){
	                maxTwo = maxOne;
	                maxOne =n;
	            } else if(maxTwo < n){
	                maxTwo = n;
	            }
	        }
	        System.out.println("First Max Number: "+maxOne);
	        System.out.println("Second Max Number: "+maxTwo);
	    }
	     
	    public static void main(String a[]){
	    	Scanner scan = new Scanner(System.in);
	    	int number=scan.nextInt();
	        int num[] = new int[number];
	        for (int i = 0; i < num.length; i++) {
				num[i]=scan.nextInt();
			}
	        MaxMin a1 = new MaxMin();
	       a1 .printTwoMaxNumbers(num);
	    }
	}
