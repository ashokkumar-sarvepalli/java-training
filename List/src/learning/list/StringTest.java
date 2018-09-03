package learning.list;

import java.util.ArrayList;
import java.util.List;

public class StringTest {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("John");
		stringList.add("Karan");
		stringList.add("Deven");
		stringList.add("karan");
		System.out.println(stringList.contains("Karan"));
		for(String str : stringList){
			System.out.println(str);
		}
	}

}
