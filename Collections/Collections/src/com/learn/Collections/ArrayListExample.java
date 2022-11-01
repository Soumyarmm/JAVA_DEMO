package com.learn.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> flist= new ArrayList<>();
		flist.add(34);
		flist.add(45);
		flist.add(67);
		
		flist.add(1,30);
		flist.add(2,99);
		
		System.out.println("after add:" +flist);
		
		flist.remove(new Integer(30));
		System.out.println("after removal:" + flist);
		
		ArrayList<Integer> slist=new ArrayList<>();
		slist.addAll(flist);
		System.out.println("list 1->"+flist);
		System.out.println("list 2->" + slist);
		
		Collections.addAll(flist, 1,2,3,4);
		System.out.println("list 1->"+flist);
		
		flist.removeAll(slist);
		
		System.out.println("after removal->list 1:" + flist);
		System.out.println("after removal->list 2:" + slist);
		
		flist.clear();
		Collections.addAll(flist, 3,4,5,6,7);
		
		System.out.println("*********************************");
		System.out.println("before retainall-. list 1:" + flist);
		System.out.println("before retainall-. list 2:" + slist);
		
		
		flist.retainAll(slist);
		System.out.println("***********************************");
		System.out.println("after retainall->list 1:" + flist);
		System.out.println("after retainall->list 2:"+slist);
		
		
		boolean contains234=flist.contains(234);
		System.out.println("flist contain 234?" + contains234);
		System.out.println("flist contains 2"+ flist.contains(2));
		
		System.out.println("***************************");
		
		boolean containsAll=flist.containsAll(slist);
		System.out.println("flist.containsAll(slist)?" + containsAll);
		
		flist.add(87);
		System.out.println("flist.containsAll(slist)?" + flist.containsAll(slist));
		System.out.println("***************");
		
		Iterator<Integer> it=flist.iterator();
		while(it.hasNext()) {
			Integer next=it.next();
			System.out.println("each element is"+next);
		}
		

		

		
		
		

	}

}
