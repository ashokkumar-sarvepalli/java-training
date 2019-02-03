package learning.inheritance;

public class Test {

	public static void main(String[] args) {
	
		
		SavingsAccount sa = new SavingsAccount();
		sa.setBalance(2000);
		System.out.println(sa.calculateInterest());
		
		System.out.println(sa.getAccountExpiry());

		sa.yearCreated = "2019";
		
		sa.getOffers();
	}

}
