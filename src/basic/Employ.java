package basic;

public class Employ {
	public static void main(String[]args) {
		Employee e1=new Employee();
		e1.setName("rinesh");
		e1.setSalary(100000);
		Employee e2=new Employee();
		e2.setName("raina");
		e2.setSalary(200000); 
		System.out.println("Employee details  "  +e1.getName() + " "  +e1.getSalary());
		System.out.println("Employee details  "  +e2.getName() +" "  +e2.getSalary());
		
	}


}
