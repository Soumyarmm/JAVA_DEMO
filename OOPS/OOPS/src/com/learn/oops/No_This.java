package com.learn.oops;

public class No_This {
	int age;
	No_This(int age){  //ambiguity in name .
		age = age;
	}
	

	public static void main(String[] args) {
		No_This h=new No_This(4);
		System.out.println("age =" + h.age);
		
	}

}
