package learning.looping;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();

		System.out.println(1);
		
		for (int i = 2; i <= number/2; i++) {

			if (number % i == 0) {
				System.out.println(i);
			}

		}
		
		System.out.println(number);

	}

}
