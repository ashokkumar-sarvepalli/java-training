package learning.scope;

public class Customer {
	
	private int id;
	private String name;
	private double salary;
	
	private static int count =0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		int a,b;
		this.salary = salary;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Customer.count = count;
	}
	
	

}
