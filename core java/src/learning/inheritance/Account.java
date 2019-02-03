package learning.inheritance;

public class Account {
	
	public Account(String accountNumber, String custName, String phone, double balance) {
		this.accountNumber = accountNumber;
		this.custName = custName;
		this.phone = phone;
		this.balance = balance;
	}
	
	public Account() {
		
	}
	
	
	private String accountNumber;
	
	private String custName;
	
	private String phone;
	
	private double balance;
	
	String yearCreated;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double calculateInterest() {
		return balance * 0.5;
	}
	
	private String secretAnswer() {
		return "iam secret";
	}
	
	
	protected String getAccountExpiry() {
		return "3 years";
	}
	
	String getOffers() {
		return "offers going on";
	}

}
