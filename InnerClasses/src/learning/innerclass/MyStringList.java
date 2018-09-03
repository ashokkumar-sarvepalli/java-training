package learning.innerclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyStringList implements Iterable<String>{
	
	private String [] myArray = new String[100];
	public static int count =0;
	
	List<String> myList = new ArrayList<String>();
	
	public void addElement(String a){
		myArray[count] = a;
		count++;
	}

	@Override
	public Iterator<String> iterator() {
		return null;
	}
	
	
	

}
