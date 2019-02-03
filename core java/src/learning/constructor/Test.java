package learning.constructor;

public class Test {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		Employee.count = 10;
		
		System.out.println("Employee1");
		
		//emp.empId = -2001;
		
		emp.setEmpId(-2001);
		emp.setName("");
		emp.setSalary(3242);
		
		System.out.println(Employee.count);
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
		
		
		Employee emp2 = new Employee(1001);
		
		
		System.out.println("Employee2");
		
		emp2.setEmpId(2002);
		
		System.out.println(emp2.getEmpId());
		System.out.println(emp2.getName());
		System.out.println(emp2.getSalary());
		
		Employee emp3 = new Employee(1002,"John",32423);
		
		emp3.count = 25;
		
		System.out.println("Employee3");
		System.out.println(emp3.getEmpId());
		System.out.println(emp3.getName());
		System.out.println(emp3.getSalary());
		
		System.out.println(Employee.count);

	}

}
