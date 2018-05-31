package basic;

public class Rectangle {
	double Length;
	double width;
	public Rectangle()
	{
		
	}
	public double getLength() {
		return Length;
	}
	public double setLength(double Length) {
		if(Length>0.0&&Length<20.0) {
			this.Length=Length;
			return Length;
		}
		else
		{
			return 0.0;
		}
		
	}
	public double getWidth() {
		return width;
	}
	public double setWidth(double width) {
		if(width>0.0&&width<20.0) {
			this.width=width;
			return width;
		}
		else
		{
			return 0.0;
		}
		
	}
	public double area() {
		double a=Length*width;
		return a;
	}
	public double perimeter() {
		double p=(Length+width)*2;
		return p;
	}
	public static void main(String[]args) {
		Rectangle r=new Rectangle();
		r.setLength(21);
		r.setWidth(2);
		System.out.println(r.area());
		System.out.println(r.perimeter());
	}

}
