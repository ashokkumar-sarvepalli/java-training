package learning.looping;

import java.util.Scanner;

public class DrawRightAngle {

	public static void main(String[] args) {
		int base;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		base = sc.nextInt();

		for (int i = 1; i <= base; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
