package learning.list;

import java.util.Set;
import java.util.TreeSet;

public class CustomerSetTest {

	public static void main(String[] args) {
		Set<Customer> custSet = new TreeSet<Customer>(new CustomerSalarySorter());

		Customer c1 = new Customer(1001, "John", 32223);
		Customer c2 = new Customer(1002, "Adam", 645);
		Customer c3 = new Customer(1003, "Mike", 4332);
		Customer c4 = new Customer(1002, "Adam", 645);

		custSet.add(c3);
		custSet.add(c4);
		custSet.add(c1);
		custSet.add(c2);
		
		for(Customer c : custSet){
			System.out.println(c);
		}
	}

}
