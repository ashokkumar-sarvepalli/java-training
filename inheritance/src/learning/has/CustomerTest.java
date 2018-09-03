package learning.has;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustId(1001);
		c.setCustName("John");
		c.setPhoneNumber("32422323");
		
		
		
		
		
		Policy p = new Policy();
		p.setPolicyId(4567);
		p.setPolicyName("Life-Insurance");
		p.setPremium(32333);
		
		
		c.setPolicy(p);
		
		
		System.out.println(c.getPolicy().getPremium());
		System.out.println(c.getPolicy().getPolicyName());
		
		
		c.getPolicy().setPremium(989);
		
		System.out.println(c.getPolicy().getPremium());
		System.out.println(p.getPremium());

	}

}
