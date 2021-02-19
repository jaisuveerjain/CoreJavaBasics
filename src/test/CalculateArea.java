package test;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter height of triangle");
		
		Scanner scanner = new Scanner(System.in);
		double height = scanner.nextDouble();
		
System.out.println("Enter base of triangle");
		
		double base = scanner.nextDouble();
		
		double area = (base*height)/2;
		
		System.out.println("Area of triangle is " +area);
		

	}

}
