package com.learn.oops_1;
interface Calculator{
	int add(int a, int b);
	
	 int subtract(int a, int b);
	 
	 int multiply(int a, int b);
}

public class Anonymous_Object {

	public static void main(String[] args) {
		Calculator c=new Calculator() {
			public int add(int a, int b) {
				return a+b;
			}

			@Override
			public int subtract(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}

			@Override
			public int multiply(int a, int b) {
				// TODO Auto-generated method stub
				return a*b ;
			}
		};
		System.out.println("add:-" + c.add(10,34));
		System.out.println("subtract:-" + c.subtract(34,30));

		System.out.println("multiply:-" + c.multiply(10,34));


	}

}
