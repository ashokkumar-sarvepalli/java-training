package learning.inheritance;

public class CheckingAccount extends Account{

	private long limit;
	
	private String offers;

	public long getLimit() {
		return limit;
	}

	public void setLimit(long limit) {
		this.limit = limit;
	}

	public String getOffers() {
		return offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}
	
	
	
}
