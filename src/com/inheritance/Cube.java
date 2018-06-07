package com.inheritance;

public class Cube extends ThreeDimension
{
// three-argument constructor
public Cube( int x, int y, int side )
{
super( x, y, side, side, side );
} // end three-argument Cube constructor

@Override
public double getArea() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public double getVolume() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public String getName() {
	// TODO Auto-generated method stub
	return null;
}
}
