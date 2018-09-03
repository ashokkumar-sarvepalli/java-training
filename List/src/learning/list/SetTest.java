package learning.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		Set<String> mySet = new LinkedHashSet<String>();
		mySet.add("John");
		mySet.add("Peter");
		mySet.add("Abi");
		mySet.add("Ram");
		mySet.add("Yash");
		mySet.add("Peter");
		mySet.add("John");
		
		Set<String> sortedSet = new TreeSet<String>(mySet);
		
		System.out.println("Before sorting");
		for(String s : mySet){
			System.out.println(s);
		}

		System.out.println("After sorting");
		
		for(String s : sortedSet){
			System.out.println(s);
		}
		
		List<String> myList = new ArrayList<String>(mySet);
		Collections.sort(myList);
		
		System.out.println("Sorted using collections sort");
		for(String s : myList){
			System.out.println(s);
		}
		
	}

}
