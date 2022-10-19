package com.hcl.practice.mathutilities;

public class FibonacciSeries {
	public static void fibonacci(int number) {

		int count = 0, term = 0;
		int t1 = 1, t2 = 1;
		if (number == 0) {
			term = t1;
		} else if (number == 1) {
			term = t2;
		} else {
			for (count = 2; count <= number; count++) {
				term = t1 + t2;
				t1 = t2;
				t2 = term;
			}

		}
		System.out.println("The "+number+"th term in fibonacci series is " + term);
	}
}
