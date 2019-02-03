package learning.branching;

import java.util.Scanner;

public class DivisibilityBy3And5 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		
		if(number%3==0 && number%5==0) {
			System.out.println("The number is divisible by both 3 and 5");
		}
		else if(number%5==0) {
			System.out.println("The number is divisble by 5 but not 3");
		}
		else if(number%3==0) {
			System.out.println("The number is divisible by 3 but not 5");
		}
		else {
			System.out.println("The number is not divisible by both 3 and 5");
		}

	}

}
