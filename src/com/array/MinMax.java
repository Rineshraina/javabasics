package com.array;

public class MinMax {
	public void disp() {
int a[]= {3,9,1,2,23,44,33,22,12};
int s=a[0];
for (int i = 0; i < a.length; i++) {	
	if(a[i]>s) {
		s=a[i];
	}
}
System.out.println("maximum number is:"+s);

for (int i = 0; i < a.length; i++) {	
	if(a[i]<s) {
		s=a[i];
	}	
}
System.out.println("minimum number is:"+s);

}
	public static void main(String[] args) {
		MinMax minMax=new MinMax();
		minMax.disp();
	}
}
