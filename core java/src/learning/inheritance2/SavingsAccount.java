package learning.inheritance2;

public class SavingsAccount extends Account {
	
	

	private double interestPct;

	private boolean isInsuranceGiven;
	
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

}
