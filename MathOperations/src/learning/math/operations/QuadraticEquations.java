package learning.math.operations;

import java.util.Scanner;

public class QuadraticEquations {

	public static void main(String[] args) {
		double a,b,c,x1,x2,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the coefficient of x^2");
		a=sc.nextDouble();
		System.out.println("Enter the coefficient of x");
		b=sc.nextDouble();
		System.out.println("Enter the constant term");
		c=sc.nextDouble();
		d=Math.sqrt((b*b)-(4*a*c));
		x1 = (-b+d)/(2*a);
		x2 = (-b-d)/(2*a);
		System.out.println("The roots of quadratic equations are "+x1+","+x2);

	}

}
