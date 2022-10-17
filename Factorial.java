package com.hcl.practice.mathutilities;

import java.util.Scanner;

public class Factorial {

	public static int factorial(int number) {
		int factorial = 1, count;
		for (count = number; count >= 1; count--) {
			factorial *= count;
		}
		return (factorial);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorial = factorial(number);
		System.out.println("factorial is " + factorial);

	}

}