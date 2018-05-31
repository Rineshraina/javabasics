package basic;

public class Even {
int a=5;
public void Odd(int a) {
	if(a%2==0) {
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
}

	public static void main(String[] args) {
		Even e=new Even();
		e.Odd(7);
	}

}
