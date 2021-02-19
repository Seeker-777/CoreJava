package test;

import java.util.Scanner;

public class triangle {
	
	static double area;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the parameter for triangle");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter base ");
		double base =scanner.nextDouble();
		System.out.println("enter heigh");
		double height =scanner.nextDouble();
		
		area=(0.5)*base*height;
		
		System.out.println("area of triangle = "+area);

	}
	

}
