package com.hcl.practice.mathutilities;

import java.util.Scanner;

public class MathUtilities {

	static Scanner sc = new Scanner(System.in);

	public static void mathUtilities(int number) {
		
		
		System.out.println("What do you want to do with it?");
		System.out.println("1. Check even or odd \n2. Check Whether prime or not");
		System.out.println("3. Get Factorial \n4. Get the nth fibonacci term");

		int operation = sc.nextInt();

		switch (operation) {
		case 1:
			EvenOrOdd.evenOrOdd(number);
			break;
		case 2:
			CheckPrime.primeFunction(number);
			break;
		case 3:
			Factorial.factorial(number);
			break;
		case 4:
			FibonacciSeries.fibonacci(number);
		}
	}

	public static void main(String args[]) {
		
		System.out.println("Enter a Number");
		int number = sc.nextInt();
		mathUtilities(number);
	}

}