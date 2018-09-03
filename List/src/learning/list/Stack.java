package learning.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack<E> implements Iterable<E>{

	private List<E> myList = new ArrayList<E>();
   
	public void push(E element) {
		myList.add(element);
	}

	public E pop() {
		E element = myList.get(myList.size() - 1);
		myList.remove(myList.size() - 1);
		return element;
	}

	public boolean find(E element) {
		return myList.contains(element);
	}

	@Override
	public Iterator<E> iterator() {
		return myList.iterator();
	}
	
	
	
	
	
	
	
	
	
	
	

}
