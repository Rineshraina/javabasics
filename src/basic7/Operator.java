package basic7;

public class Operator {
	public static void main(String[]args) {
		int i=10;
		i++;
		i--;
		int negi=-20;
		boolean is=false;
		System.out.println(!is);
		System.out.println(i>20);
		System.out.println(i<20);
		System.out.println(i>=10);
		System.out.println(i<=10);
		System.out.println(i==10);
		System.out.println(i!=20);
		System.out.println(6&3);
		System.out.println(6|3);
		System.out.println(6^3);
		System.out.println(i==10&is);
		System.out.println(i==10|is);
		System.out.println(is&&confirm());
		
	}
public static boolean confirm() {
	return true;
}
}
