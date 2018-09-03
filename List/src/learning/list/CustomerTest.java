package learning.list;

import java.util.LinkedList;
import java.util.List;

public class CustomerTest {

	public static void main(String[] args) {

		List<Customer> custList = new LinkedList<Customer>();

		Customer c1 = new Customer(1001, "John", 32223);
		Customer c2 = new Customer(1002, "Adam", 645);
		Customer c3 = new Customer(1003, "Mike", 4332);

		custList.add(c1);
		custList.add(c2);
		custList.add(c3);

		custList.remove(2);
		
		Customer c4 = new Customer(1002,"Adam",645);
		
		
		System.out.println(custList.contains(c4));
		
		System.out.println(custList.get(0).getCustId());
		System.out.println(custList.size());

		System.out.println("Older approach");
		for (int i = 0; i < custList.size(); i++) {
			System.out.println(custList.get(i).getCustId());
			System.out.println(custList.get(i).getName());
			System.out.println(custList.get(i).getSalary());
		}

		System.out.println("New approach for each loop ");

		for (Customer c : custList) {
			// System.out.println(c.getCustId());
			// System.out.println(c.getName());
			// System.out.println(c.getSalary());

			System.out.println(c);
		}
	}
}
