package com.learn.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, String>map=new HashMap<>();
		map.put("name", "somu");
		map.put("Id", "23");
		map.put("city", "puri");
		map.put("email", "123s@gamil.com");
		
		System.out.println("only keys" + map.keySet());
		System.out.println("only keys"+map.values());
		
		Set<Map.Entry<String, String>> entries=map.entrySet();
		System.out.println("entry set->" + entries);
		
		Iterator<Map.Entry<String, String>> it=entries.iterator();
		 System.out.println("**************************************************");
		 while(it.hasNext()){
	            Map.Entry<String, String> currentEntry = it.next();
	            System.out.println("Current Entry is "+ currentEntry);
	            System.out.println("Current Key is "+ currentEntry.getKey());
	            System.out.println("Current Value is "+ currentEntry.getValue());
	            System.out.println("------------------------");
	        }
	        System.out.println("**************************************************");
	        System.out.println("propsMap.containsKey('city') :- "+map.containsKey("city"));

	        System.out.println(map);
	        System.out.println(" propsMap.get('id') VALUE -> "+  map.get("id"));

	        map.remove("city");
	        System.out.println("After removal propsMap -> "+  map);

	        map.remove("email", "123s@gamil.com");
	        System.out.println("After removal(k=v) propsMap -> "+  map);


	}

}
