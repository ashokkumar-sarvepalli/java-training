package learning.loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		
		int i;
		boolean flag = true;
		for(i=2;i<num/2;i++){
			if(num%i==0){
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("It is a Prime Number");
		}
		else
		{
			System.out.println("It is not a Prime Number");
		}

	}

}
