package learning.looping;

import java.util.Scanner;

public class DrawRect {

	public static void main(String[] args) {
		
		int length,breadth;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		length = sc.nextInt();
		System.out.println("Enter the breadth");
		breadth = sc.nextInt();
		
		for(int i=1;i<=breadth;i++) {
			for(int j=1;j<=length;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
