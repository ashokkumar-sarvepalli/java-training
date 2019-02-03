package learning.array;

import java.util.Scanner;

public class ArrayContent {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements to use");
		n = sc.nextInt();
		int[] arr = new int[n];

		// input
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the next element");
			arr[i] = sc.nextInt();

		}

		// logic
		for (int i = 0; i < n; i++) {

			if (arr[i] % 2 == 0) {
				arr[i] = arr[i] / 2;
			} else {
				arr[i] = arr[i] * 2;
			}

		}

		// output
		System.out.println("The array content after the logic is ");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);

		}

	}

}
