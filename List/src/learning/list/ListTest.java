package learning.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {

		List<Integer> myList = myWebService();
		int val =  myList.get(0);
		int val1 =  myList.get(1);
		int val2 =  myList.get(2);
		
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(myList.size());
		System.out.println(myList.contains(5.6));
		
		System.out.println(myList.isEmpty());
		
	}
	
	public static List<Integer> myWebService(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(9);
		
		return list;
		
	}

}
