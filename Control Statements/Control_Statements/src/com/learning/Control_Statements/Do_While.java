package com.learning.Control_Statements;

import java.util.Scanner;

//Java program to find the sum of positive numbers
public class Do_While {

	public static void main(String[] args) {
		int sum=0;
		int number=0;
		Scanner input=new Scanner(System.in);
		do {
			sum+=number;
			System.out.println("enter a number");
			number=input.nextInt();
		}while(number>=0);
			System.out.println("sum=" +sum);
			input.close();
		}

	}


