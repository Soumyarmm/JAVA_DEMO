package com.learning.Operator;

public class Ternary {

	public static void main(String[] args) {
		int a, b;
		a = 10;
		b = a < 0 ? -a : a; // get absolute value of a
		System.out.print("Absolute value of ");
		System.out.println(a + " is " + b);
		a = -10;
		b = a < 0 ? -a : a; // get absolute value of a
		System.out.print("Absolute value of ");
		System.out.println(a + " is " + b);
		}
		

	}


