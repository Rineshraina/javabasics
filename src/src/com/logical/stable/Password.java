package com.logical.stable;

public class Password {
	static int max=0;
	static int min=0;
	static int p;
	static int password=0;
	
public void findpassword(int a,int b,int c,int d,int e)
{ 
	show(a);
	show(b);	
	show(c);
	show(d);
	show(e);
	//int p=p1+p2+p3+p4+p5;
	//return p;
	
}
public static void  show(int x){
String s=String.valueOf(x);
String a="";
//int password=0;
int count=0;
for(int i=0;i<s.length();i++)
{
for(int j=0;j<s.length();j++)
{
if(s.charAt(i)==s.charAt(j))
{ 
if(i!=j)
{
	count=1;
a += s.charAt(i); 
}
}
}
}
if(count==0)
{
if(x>max)
{
	max=x;
}
	//return password;
}
else
{

if(a.equals(s)==true)
{ 
  //return password;
	if(x>max)
	{
		max=x;
	}
}
else
{
//password=Integer.parseInt(s);
//return password;
	if(p==0)
	{
		p=x;
		p++;
	}
	else if(p>min)
	{
		min=p;
	}
}
}
password=max+min;
}


public static void main(String[] args) {
	Password stable=new Password();
	stable.findpassword(1313,12,122,678,898);
	System.out.println(password );
}
}
