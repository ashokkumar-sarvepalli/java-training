package learning.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingTest {

	public static void main(String[] args) {
		List<String> myList = new LinkedList<String>();
		myList.add("John");
		myList.add("Abi");
		myList.add("Nisha");
		myList.add("Banu");

		Collections.sort(myList, Collections.reverseOrder());
				

		for(String str : myList){
		 System.out.println(str);
		}
		
		
		// adding objects and sorting
		
		
		List<Customer> custList = new ArrayList<Customer>();

		Customer c1 = new Customer(1001, "John", 32223);
		Customer c2 = new Customer(1002, "Adam", 645);
		Customer c3 = new Customer(1003, "Mike", 4332);

		custList.add(c1);
		custList.add(c3);
		custList.add(c2);
		System.out.println("Before sorting customers");
		for (Customer c : custList) {
			System.out.println(c);
		}
		
		Collections.sort(custList,new CustomerSalarySorter());
		
		
		
		
		System.out.println("After sorting customers");
		for (Customer c : custList) {
			System.out.println(c);
		}
		

	}

}
