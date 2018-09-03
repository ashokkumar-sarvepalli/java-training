package learning.serialize;

import java.io.Serializable;

public class Policy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4162723837360281289L;
	private int policyId;
	private String name;
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
	
	
}
