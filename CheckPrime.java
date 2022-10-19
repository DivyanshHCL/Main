package com.hcl.practice.mathutilities;

public class CheckPrime {

	public static void primeFunction(int number) {

		int flag = 0, count;
		for (count = 2; count < number; count++) {
			if (number % count == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("not prime");
			System.out.println("It was divisible by " + count);
		} else {
			System.out.println("prime");
		}
	}
}