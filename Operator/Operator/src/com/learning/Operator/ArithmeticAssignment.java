package com.learning.Operator;
//several assignment operators.

public class ArithmeticAssignment {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		
		a+=5;
		b*=3;
		c+=a*b;
		c%=9;
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		System.out.println("c=" +c);

	}

}
