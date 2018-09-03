package learning.branching;

import java.util.Scanner;

public class DivisibilityTest {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		a = sc.nextInt();

		if (a%3==0) {
			System.out.println("It is divisible by 5 but not 3");
		} else if (a % 3 == 0) {
			System.out.println("It is divisible by 3 but not 5");
		} else if (a % 3 == 0 && a % 5 == 0) {
			System.out.println("It is divisible by both 3 and 5");
		} else {
			System.out.println("It is not divisible by both 3 and 5");
		}
	}

}
