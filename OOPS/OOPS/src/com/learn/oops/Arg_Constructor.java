package com.learn.oops;

public class Arg_Constructor {
	String languages;
	Arg_Constructor(String lang){
		languages=lang;
		System.out.println(languages +  " programming language ");
	}
	

	public static void main(String[] args) {
		Arg_Constructor d= new Arg_Constructor("python");
		Arg_Constructor t= new Arg_Constructor("flutter");

		Arg_Constructor r= new Arg_Constructor("swift");

		

	}

}
