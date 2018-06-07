package com.inheritance;

public class ShapeTest
{
// create Shape objects and display their information
public static void main( String args[] )
{
Shape shapes[] = new Shape[ 4 ];
shapes[ 0 ] = new Circle( 22, 88, 4 );
shapes[ 1 ] = new Square( 71, 96, 10 );
shapes[ 2 ] = new Triangle( 8, 89, 2, 7 );
shapes[ 3 ] = new Cube( 79, 61, 8 );
// call method print on all shapes
for ( Shape currentShape : shapes )
{
System.out.printf( "%s: %s",currentShape.getName()+","+ currentShape );
if ( currentShape instanceof TwoDimension )
{
TwoDimension twoDimensionalShape =
( TwoDimension ) currentShape;
System.out.printf( "%s's area is %s\n",
currentShape.getName(), twoDimensionalShape.getArea() );
} // end if
if ( currentShape instanceof ThreeDimension )
{
ThreeDimension threeDimensionalShape =
( ThreeDimension) currentShape;
System.out.printf( "%s's area is %s\n",
currentShape.getName(), threeDimensionalShape.getArea() );
System.out.printf( "%s's volume is %s\n",
currentShape.getName(),
threeDimensionalShape.getVolume() );
}
System.out.println();
} // end for
} // end main
} 