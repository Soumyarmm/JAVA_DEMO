package com.learn.oops_1;

abstract class Animal{
	abstract void eat();
	void move() {
		System.out.println("animal can move");
	}
}

class Lion extends Animal{
	void eat() {
		System.out.println("lion only eat flesh");
	}
}

class Girafee extends Animal{
	void eat() {
		System.out.println("it only eat grass");
	}
}
public class Abstract {

	public static void main(String[] args) {
		Lion lion=new Lion();
		lion.eat();
		lion.move();
		
		Animal girafee=new Girafee();
		girafee.eat();
		girafee.move();
		

	}

}
