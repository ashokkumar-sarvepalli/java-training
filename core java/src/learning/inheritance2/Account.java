package learning.inheritance2;

public class Account {
	
	
	private String accountNumber;
	
	private String custName;
	
	private String phone;
	
	private double balance;

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
	
	public double calculateInterest() {
		return balance * 0.5;
	}
	

}
