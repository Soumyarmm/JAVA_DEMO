package com.learning.Control_Statements;

public class Switch {

	public static void main(String[] args) {
		int number=90;
		String size = null;
		 // switch statement to check size
		switch(number) {
		case 29:
			size="small";
			break;
		case 42:
			size="medium";
			break;
			
			// match the value of week
		case 40:
			size="large";
			break;
		case 90:
			size="unknown";
		}
		System.out.println("size:" + size);
		

	}

}
