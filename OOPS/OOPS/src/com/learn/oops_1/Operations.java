package com.learn.oops_1;

public class Operations {

	public static void main(String[] args) {
		Operations op=new Operations();
		System.out.println("addition(int a, int b) : " + op.addition(10, 20));
        System.out.println("addition(short a, int b) : " + op.addition((short) 10, 20));
        System.out.println("addition(long a, int b) : " + op.addition((long) 10, 20));
        System.out.println("addition(int a, int b, int c) : " + op.addition(10, 20, 30));

	}
	public int addition(int a, int b) {
		System.out.println("Invoking addition(int a, int b)");
		return a+b;
	}
	public int addition(short a, short b) {
		System.out.println("Invoking addition(short a, int b)");
		return a+b;
	}
	public long addition(long a, int b) {
        System.out.println("Invoking addition(long a, int b)");
        return a + b;
    }

    public long addition(long a, long b) {
        System.out.println("Invoking addition(long a, long b)");
        return a + b;
    }

    public int addition(int a, int b, int c) {
        System.out.println("Invoking addition(int a, int b, int c)");
        return a + b + c;
    }
	

}
