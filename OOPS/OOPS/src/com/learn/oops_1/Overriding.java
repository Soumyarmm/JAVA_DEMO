package com.learn.oops_1;
class Animals{
	public void eatFood() {
		System.out.println("animals eat food");
	}
}
class Elephant  extends Animals{
	public void eatFood() {
		System.out.println("it eats only grass");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Elephant e=new Elephant();
		e.eatFood();

	}

}
