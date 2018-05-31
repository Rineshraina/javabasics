package basic8;

public class Reverseprocess {
	public  static void main(String[]args) {
		int n=3761,reversed=0;
		while(n!=0) {
			int i=n%10;
			reversed=reversed*10+i;
			n/=10;
		}
	System.out.println("Reversed number: "+reversed);
	}
	

}
