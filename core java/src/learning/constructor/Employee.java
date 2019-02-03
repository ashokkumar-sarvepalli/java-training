package learning.constructor;

public class Employee {

	private int empId;
	private String name;
	private double salary;
	
	public static int count;

	public Employee() {
	}

	public Employee(int employeeId) {
		empId = employeeId;
	}

	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public void setEmpId(int empId) {

		if (empId > 0) {
			this.empId = empId;
		}
	}

	public int getEmpId() {
		return this.empId;
	}

	public String getName() {
		return "Mr "+name;
	}

	public void setName(String name) {
		
		if(name.length()>0)
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
