package com.learn.oops;

public class Constructor_Overloading {
	String language;
	
	Constructor_Overloading(){
		this.language="python";
	}
	Constructor_Overloading(String language){
		this.language=language;
	}
	public void getName() {
		System.out.println("programming language :" + this.language);
	}
	

	public static void main(String[] args) {
		Constructor_Overloading g= new Constructor_Overloading();
		Constructor_Overloading h=new Constructor_Overloading("java");
		g.getName();
		h.getName();

		

	}

}
