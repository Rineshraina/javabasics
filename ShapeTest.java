package com.inheritance;

public class ShapeTest
{
// create Shape objects and display their information
public static void main( String args[] )
{
	ShapeTest st=new ShapeTest();
	Circle c=new Circle(10, 2);
	Cube cu=new Cube(3, 3, 4);
	Triangle t=new Triangle(3, 5);
	Square sq=new Square(3,6,2);
	ThreeDimension td=new ThreeDimension(1,2,3);
	TwoDimension t3=new TwoDimension(3,2);
	st.getarea(t3);
	st.getarea(c);
	st.getarea(cu);
	st.getarea(t);
	st.getarea(td);
	st.getarea(sq);
		
}
void getarea(Shape shape)
{
	shape.area();
	shape.getVolume();
	
}
}