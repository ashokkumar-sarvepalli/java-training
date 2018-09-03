package learning.policy.pojo;

public class Policy {
	
	private int policyId;
	private String name;
	private int term;
	private double premium;
	
	public Policy() {}
	public Policy(int policyId, String name, int term, double premium) {
		
		this.policyId = policyId;
		this.name = name;
		this.term = term;
		this.premium = premium;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
	
	
	

}
