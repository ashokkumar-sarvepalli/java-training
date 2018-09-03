package learning.constructor;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e = new Employee(1002,"Bob",4333);
		System.out.println(e.getId());
		
		Employee e2 = new Employee(1003,"Chris",4311);
		System.out.println(e2.getId());
		System.out.println(e2.getName());
		
		Employee e3 = new Employee(1001,"John",3233.0);
		System.out.println(e3.getId());
		System.out.println(e3.getName());
		System.out.println(e3.getSalary());
		e3.setSalary(4000);
		
		
	}

	
}
