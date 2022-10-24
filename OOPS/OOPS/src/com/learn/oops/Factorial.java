package com.learn.oops;

public class Factorial {
	static int Factorial(int n) {
		if(n!=0)
			return n*Factorial(n-1);
		else
			return 1;
	}

	public static void main(String[] args) {
		int number=4,result;
		result=Factorial(number);
		System.out.println(number + "Factorial=" + result);
	}

}
