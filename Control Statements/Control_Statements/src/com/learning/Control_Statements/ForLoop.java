package com.learning.Control_Statements;
//for loop is used to run a block of code .
// Program to find the sum of natural numbers from 1 to 1000.
public class ForLoop {

	public static void main(String[] args) {
		int sum=0;
		int n=1000;
		for(int i=0;i<=n;i++) {
			sum +=i;
		}
		System.out.println("summ =" +sum);

	}

}
