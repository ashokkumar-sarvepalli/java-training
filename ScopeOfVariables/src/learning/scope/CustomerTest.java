package learning.scope;

import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		int a,b;
		Customer c1 = new Customer();
		c1.setId(10);
		c1.setCount(23);
		
		Customer c2 = new Customer();
		System.out.println(c2.getId());
		System.out.println(c2.getCount());
		
		Customer.setCount(34);
		
		System.out.println(c1.getId());
		System.out.println(c1.getCount());
		
		double aa = Math.sqrt(36);
		System.out.println(aa);
		
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
	}

}
