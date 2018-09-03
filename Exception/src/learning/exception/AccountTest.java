package learning.exception;

public class AccountTest {

	public static void main(String[] args) {

		Account account1 = new Account(-1001,7000);
		Account account2 = new Account(1002,5000);
		
		
		try {
			Bank.withDraw(account1, 10000);
		} catch (InSufficientBalanceException e) {
			System.out.println(e.getMessage());
		} catch (InvalidAccountException e) {
			System.out.println(e.getMessage());
		}
		try {
			Bank.withDraw(account2, 10000);
		} catch (InSufficientBalanceException e) {
			System.out.println(e.getMessage());

		}catch (InvalidAccountException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());

	}

}
