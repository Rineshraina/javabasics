package basic2;

public class Switch1 {
  public static void main(String[]args) {
	  int age=20;
	  switch(age)
	  {
	  case 10:
		  System.out.println("child");
		  break;
	  case 20:
		  System.out.println("adult");
		  break;
	  case 60:
		  System.out.println("old");
          break;
       default:
    	   System.out.println("default");
	  }
  }
}
