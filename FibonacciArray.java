package com.hcl.practice.mathutilities;

import java.util.Scanner;

public class FibonacciArray {

	Scanner sc=new Scanner(System.in);
	
		void fibonacciArray()
		{
		System.out.println("Enter number of fibonacci terms you want");
		int size=sc.nextInt();
		int[] Fibonacci= new int[size];
		int count = 0;
		Fibonacci[0]=0;
		Fibonacci[1]=1;
		for (count = 2; count < size; count++) {
			Fibonacci[count]=Fibonacci[count-1]+Fibonacci[count-2];
			}
		for (count = 0; count < size; count++) {
			System.out.println(Fibonacci[count]);
		}	
	}

}
