package com.learn.oops_1;

public class NestedClassDemo {
	class Calculator{
		int add(int a, int b) {
			return a+b;
		}
		int subtract(int a, int b) {
			return a-b;
		}
	}

	public static void main(String[] args) {
		NestedClassDemo ob=new NestedClassDemo();
		// TODO Auto-generated method stub

	}
	public void createObj() {
		Calculator c=new Calculator();
		 System.out.println("Addition add(10, 20) " + c.add(10, 20));
	        System.out.println("subtract subtract(10, 20) " + c.subtract(56, 20));
	}

}
