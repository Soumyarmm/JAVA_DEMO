package com.learn.oops;

public class No_Arg_Constructor {
	int i;
	No_Arg_Constructor(){
		i=9;
		System.out.println("constructor is called");
	}

	public static void main(String[] args) {
		No_Arg_Constructor c= new No_Arg_Constructor();
		System.out.println("value is:" +c.i);
		
	}

}
