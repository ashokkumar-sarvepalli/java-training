package learning.list;

public class StackTest {

	public static void main(String[] args) {

		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(6);
		myStack.push(7);
		myStack.push(8);
	
		for(Integer i : myStack){
			System.out.println((i));
		}

	}

}
