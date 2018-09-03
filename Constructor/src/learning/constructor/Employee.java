package learning.constructor;

public class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee() {

		id = 0;
		name = "";
		salary = 0.0;

	}

	public Employee(int id) {
		this.id = id;
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
