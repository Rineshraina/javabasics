package basic;

public class Date {
int day1;int month1;
int year;
public int getDay1() {
	return day1;
}
public void setDay1(int day1) {
	this.day1 = day1;
}
public int getMonth1() {
	return month1;
}
public void setMonth1(int month1) {
	this.month1 = month1;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public void displayDate(int day1,int month1,int year)
{
	System.out.println("date is "+day1+"/"+month1+"/"+year);
}
public static void main(String[]args) {
	Date d=new Date();
	d.displayDate(26,11,1997);
}
}
