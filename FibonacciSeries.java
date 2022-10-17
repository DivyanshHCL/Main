package com.hcl.practice.mathutilities;

import java.util.Scanner;

public class FibonacciSeries {
	public static int fibonacci(int number) {
		int count = 0, term=0;
		int t1 = 0, t2 = 1;
		if(number==0)
		{
			term=t1;
		}
		else
			if(number==1)
			{
				term=t2;
			}
			else
			{
		for (count = 2; count <= number; count++) {
			term = t1 + t2;
			t1 = t2;
			t2 = term;
			}
		
			}
		return(term);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of which you want fibonacci term of");
		int number=sc.nextInt();
		System.out.println(fibonacci(number));
}
}
