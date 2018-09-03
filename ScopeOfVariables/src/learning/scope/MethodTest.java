package learning.scope;

public class MethodTest {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setId(10);
		change2(c);
		System.out.println(c.getId());

	}
	
	
	public static void change2(Customer x){
		System.out.println(x.getId());
		x.setId(100);
	}

}
