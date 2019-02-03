package learning.interfaces;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int choice;
		do {
			System.out.println("1.CSE Department 2.ECE Department 3. EEE Department 4.Exit");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				printDepartment(new CSEDepartment());
				break;

			case 2:
				printDepartment(new ECEDepartment());
				break;

			case 3:
				printDepartment(new EEEDepartment());
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid choice entered");
			}

		} while (choice != 4);

	}

	private static void printDepartment(Department department) {
		double passPercent = department.getPassPercentage("unittest");
		String topper = department.getTopper("unittest");
		System.out.println("Pass percentage of department "+department.getDepartmentName()+"is "+passPercent);
		System.out.println("topper  of department "+department.getDepartmentName()+"is "+topper);

	}
	

}
