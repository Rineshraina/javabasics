package basic;

public class Savings {
public static double rate;
private double balance;
public  double getRate() {
	return rate;
}
public  void setRate(double rate) {
	Savings.rate = rate/100.0;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public double disp() {
	double interest=(balance*rate)/12;
	balance=balance+interest;
	return balance;
}
public static void main(String[] args) {
	Savings s1=new Savings();
	Savings s2=new Savings();
	s1.setRate(4);
	s2.setRate(4);
	s1.setBalance(2000);
	s2.setBalance(3000);
	System.out.println(s1.disp());
	System.out.println(s2.disp());
	s1.setRate(5);
	s2.setRate(5);
	s1.setBalance(2000);
	s1.setBalance(3000);
	System.out.println(s1.disp());
	System.out.println(s2.disp());
}

}
