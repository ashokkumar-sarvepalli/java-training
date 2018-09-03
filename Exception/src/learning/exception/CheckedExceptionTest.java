package learning.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionTest {

	public static void main(String[] args){
		try {
			methodA();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		 

	}

	private static void methodA() throws FileNotFoundException {
		System.out.println("inmethod a");
		methodB();
		System.out.println("hello6");
		
	}

	private static void methodB() throws FileNotFoundException {
		System.out.println("inmethod b");
		FileReader file = new FileReader("C:\\test\\a.txt");
		System.out.println("hello2");
		
	}

}
