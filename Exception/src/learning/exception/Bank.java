package learning.exception;

public class Bank {

	public static void withDraw(Account account, double amount) throws InSufficientBalanceException, InvalidAccountException {

		if(account.getAccountId()<0){
			throw new InvalidAccountException("Invalid account number");
		}
		double currentBalance = account.getBalance();
		if (amount <= currentBalance) {
			double newBalance = currentBalance - amount;
			account.setBalance(newBalance);
		}
		else{
			throw new InSufficientBalanceException("balance insufficient");
		}
		
		

	}

	public static void deposit(Account account, double amount) {
		double currentBalance = account.getBalance();
		double newBalance = currentBalance + amount;
		account.setBalance(newBalance);
	}

}
