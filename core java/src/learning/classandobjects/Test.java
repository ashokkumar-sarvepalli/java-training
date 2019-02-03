package learning.classandobjects;

public class Test {

	public static void main(String[] args) {
	
		int a = 6,b=7,c;
		
		change(a,b);
		
		
		
		System.out.println(a);
		System.out.println(b);
		
		
		int [] arr = new int[10];
		arr[0] = 20;
		
		changeArray(arr);
		
		System.out.println(arr[0]);
		
		

	}
	
	private static void changeArray(int[] arr) {
		
		arr[0] = 10;
		
	}

	public static void change(int c, int d) {
		c = c+10;
		d = d+20;
	}


}
