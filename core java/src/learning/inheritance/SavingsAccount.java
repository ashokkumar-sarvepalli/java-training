package learning.inheritance;

public class SavingsAccount extends Account {
	
	

	private double interestPct;

	private boolean isInsuranceGiven;

	public SavingsAccount(String accountNumber, String custName, String phone, double balance, double interestPct, boolean isInsuranceGiven) {
		super(accountNumber,custName,phone,balance);
		this.interestPct = interestPct;
		this.isInsuranceGiven = isInsuranceGiven;
	}
	
	
	public SavingsAccount() {
		
	}
	
	public double getInterestPct() {
		return interestPct;
	}

	public void setInterestPct(double interestPct) {
		this.interestPct = interestPct;
	}

	public boolean isInsuranceGiven() {
		return isInsuranceGiven;
	}

	public void setInsuranceGiven(boolean isInsuranceGiven) {
		this.isInsuranceGiven = isInsuranceGiven;
	}
	
	
	public double calculateInterest() {
		System.out.println("Your account expires is "+getAccountExpiry()+ "offers are "+getOffers());
		return getBalance() * 0.6;
	}
	


}
