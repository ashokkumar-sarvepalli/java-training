package learning.inheritance;

public class MinorAccount extends SavingsAccount{
	
	
	
	private int age;
	
	private int grade;

	public MinorAccount() {
		
	}
	
	
	
	public MinorAccount(String accountNumber, String custName, String phone, double balance, double interest, boolean insurance, int age, int grade) {
		super(accountNumber,custName,phone,balance,interest,insurance);
		this.age = age;
		this.grade = grade;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	

}
