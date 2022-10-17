package com.hcl.practice.mathutilities;

public class CheckPrime {
	static int flag,count;

	public static int primeFunctionCheck(int number) {
		
		for(count=2; count<number; count++)
		{
		if(number % count == 0)
		{
			flag=1;
			break;
		}
		}return(flag);}

	public static void primeFunction(int number) {

		primeFunctionCheck(number);
		if (primeFunctionCheck(number) == 1) {
			System.out.println("not prime");
			System.out.println("It was divisible by " + count);
		} else {
			System.out.println("prime");
		}
	}
}