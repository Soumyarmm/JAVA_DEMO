package com.learn.oops_1;

class CounterTest{
	private int counter=0;
	
	public CounterTest(int counter) {
		System.out.println("argument constructor");
		this.counter=counter;
	}
	public CounterTest() {
		System.out.println("argument constructor");
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int value) {
		if(value<=0) {
			throw new IllegalArgumentException("invalid for counter");
		}
		this.counter=value;
	}
	public String toString() {
        return "CounterTest{" +
                "counter=" + counter +
                '}';
    }
	
}
public class EncapsulationExample {

	public static void main(String[] args) {
		int a = 10; //Local Variable.

        System.out.println("\nExample of default constructor");
        CounterTest counterObject1 = new CounterTest();
        /*
         * CounterTest -> Reference Type (Classname)
         * counterObject1 -> Reference Variable / Object
         * new -> procure the memory(heap) and assign it to this object
         * constructor -> initialize the object
         *  1. CounterTest() -> Invokes default constructor
         *  2. CounterTest(10) -> Invokes parameterized constructor
         * */
        System.out.println("counterObject1 -> Before :- " + counterObject1.getCounter());
        counterObject1.setCounter(4);
        System.out.println("counterObject1 -> After :- " + counterObject1.getCounter());

        System.out.println("\nExample of parameterized constructor");
        CounterTest counterObject2 = new CounterTest(12);
        System.out.println("counterObject2 -> Before :- " + counterObject2.getCounter());
        counterObject2.setCounter(25);
        System.out.println("counterObject2 -> After :- " + counterObject2.getCounter());


        CounterTest counterObject3 = new CounterTest(34);
        System.out.println("\n*************** All the different Object values...");
        System.out.println("All -> counterObject1 -> :- " + counterObject1.getCounter());
        System.out.println("All -> counterObject2 -> :- " + counterObject2.getCounter());
        System.out.println("All -> counterObject3 -> :- " + counterObject3.getCounter());

        System.out.println(counterObject1);
    }
}
