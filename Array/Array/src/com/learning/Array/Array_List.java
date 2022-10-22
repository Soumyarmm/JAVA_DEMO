package com.learning.Array;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> animals=new ArrayList<>();
		animals.add("cow");
		animals.add("dog");
		animals.add("tiger");
		System.out.println("Arralisyt:" +animals);
		System.out.println("accessing individual elements:");
		for(String language:animals) {
			System.out.println(language);
			System.out.print(",");
		}

	}

}
