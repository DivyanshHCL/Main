package com.hcl.practice.mathutilities;
import java.util.Scanner;

	public class MathTools
	{
		public static void main(){
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int number=sc.nextInt();
			
			System.out.println("What do you want to do with the number");
			int count, operation;
			
			System.out.println("1. Prime Check 	2. Calculate factorial 3. Get Fibonacci of the number");
			operation=1;
			switch(operation)
			{
			case 1: EvenOrOdd.evenOrOdd(number);break;
			}
			
				
			
	}}
	
		
		
