package learning.arrays;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		int []arr = new int[100];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of numbers you want to add?");
		n=sc.nextInt();
		
		int i;
		int sum =0;
		for(i=0;i<n;i++){
			System.out.println("Enter the number");
			arr[i] = sc.nextInt();
			sum = sum+arr[i];
		}
		
		System.out.println("The sum of the numbers is "+sum);

	}

}
