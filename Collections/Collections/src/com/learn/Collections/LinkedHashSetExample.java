package com.learn.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		 LinkedHashSet<String> names = new LinkedHashSet();
	        names.add("Keshav");
	        names.add("Satya");
	        names.add("somu");
	        names.add("somu");
	        names.add("gitu");
	        names.add("litu");
	        names.add("chiku");
	        names.add("ram");
	        names.add("siyachin");
	        names.add("ladakh");

	        System.out.println("LinkedHashSet is " + names);

	    }
	}