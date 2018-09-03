package learning.object;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCustId(1001);
		c1.setCustName("John");
		c1.setPhoneNumber("4334");
		
		System.out.println();

		System.out.println(c1.hashCode());
		
		Customer c2 = new Customer();
		c2.setCustId(1001);
		c2.setCustName("John");
		c2.setPhoneNumber("43341");
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c2.hashCode());

		
		System.out.println(c1.equals(c2));
		
		
		String a="hello";
		String b="hello";
		
		System.out.println(a);

	}

}
