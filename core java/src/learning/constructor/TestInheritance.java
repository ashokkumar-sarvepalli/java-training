package learning.constructor;

import learning.inheritance.SavingsAccount;

public class TestInheritance {

	public static void main(String []args) {
		SavingsAccount sa = new SavingsAccount();
		sa.setBalance(2000);
		System.out.println(sa.calculateInterest());
		
		
	}
}
