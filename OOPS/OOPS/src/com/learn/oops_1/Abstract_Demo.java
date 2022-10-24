package com.learn.oops_1;
abstract class Animal1{
	public void eat(String name,String foodName) {
		System.out.println("animal" +  name +  "eats"  + foodName);
	} 
	public abstract void move();
	public abstract void sleep();
}


 class Tiger extends Animal1{
	 public void move() {
		 System.out.println("lion walks");
		
	}
	 public void sleep() {
		 System.out.println("lion sleeps in den");
	 }
}
 
 class Tortoise extends Animal1{
	 public void move() {
		 System.out.println("it can walk and switm in the water");
	 }
	 public void sleep() {
		 System.out.println("it sleeps in dark areas");
	 }
 }

public class Abstract_Demo {

	public static void main(String[] args) {
		Tortoise animal=new Tortoise();
		animal.eat("Tortoise", "grass");
		animal.eat("lion", "flesh");
		
		animal.move();
		animal.move();

	}
}


