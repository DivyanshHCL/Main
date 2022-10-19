package com.hcl.practice.mathutilities;

public class Factorial {

	public static void factorial(int number) {
		 int count=1;
		for (count = number-1; count > 1; count--) {
			number *= count;
		}
		System.out.println("Factorial is "+ number);
	}

}