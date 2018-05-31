package basic;

public class Perfect { 
	
	int a;
	int s=0;
	public void isperfect(int g) {
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				s=s+i;
			}
		}
		if(s==a) {
			System.out.println("it is a perfect number");
		}
		else
		{
			System.out.println("it is not a perfect number");
		}
	}
	public static void main(String[]args) {
		Perfect p=new Perfect();
		p.isperfect(6);
	}

}
