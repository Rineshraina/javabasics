package basic;

public class Reverse
{
   public static void main(String args[])
   {
	   int n=83562;
	   int num[]=new int[6];
	   for (int i = 0; i < num.length; i++) {
		num[i]=n%10;
		n/=10;
		System.out.println(num[i]);
	}
   }}