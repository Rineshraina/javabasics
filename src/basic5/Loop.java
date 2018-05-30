package basic5;

public class Loop {
	public static void main( String[] args )
	{
	int count = 1;

	do
	{
	 System.out.println( count % 2 == 1 ? "****" : "++++++++" );
	 ++count;
	 } 
	while ( count <= 10 );
	 } 


}
