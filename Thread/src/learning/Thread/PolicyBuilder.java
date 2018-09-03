package learning.Thread;

public class PolicyBuilder implements Runnable {

	private Policy policy;
	private String policyName;

	public PolicyBuilder(Policy policy, String policyName) {
		this.policy = policy;
		this.policy.setPolicyName(policyName);
	}

	public void run() {

		for (int i = 0; i < 100; i++) {
			synchronized (Policy.class) {
				this.policy.setCount(this.policy.getCount() + 1);
			
			System.out
					.println(Thread.currentThread().getName() + "  :  " + this.policy.getCount() + "has been created");
			}
		}
		
		
		
	}

}
