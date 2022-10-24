package com.learn.oops;
//constructor overloading with this

public class Complex {
	private int a,b;
	 private Complex(int i, int j) {
		 this.a=i;
		 this.b=j;	 
	 }
	 private Complex(int i) {
		 this(i,i);
	 }
	 private Complex() {
		 this(0);
	 }
	 public String tostring() {
		 return this.a + "+" + this.b + "i";
	 }

	public static void main(String[] args) {
		Complex c=new Complex(2,3);
		Complex c2=new Complex(2);
		Complex c3=new Complex();
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);



	}

}
