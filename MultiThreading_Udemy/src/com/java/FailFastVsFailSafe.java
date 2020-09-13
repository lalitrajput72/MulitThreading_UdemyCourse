package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastVsFailSafe {
	
	public static void main(String[] args) {
		
		//ArrayList is Fail Fast
		List<Integer> list=new ArrayList<>();
		
		list.add(2);
		list.add(6);
		list.add(3);
		list.add(2);
		list.add(9);
		list.remove(new Integer(2)); //Remove item
		list.remove(2); // remove index
		ListIterator<Integer> itr=list.listIterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next()+" , ");
			itr.remove();
		}
		
		// Fail Safe
		List<String> failSafe=new CopyOnWriteArrayList<>();
		failSafe.add("H");
		failSafe.add("M");
		failSafe.add("R");
		failSafe.add("S");
		
		Iterator<String> itrerator =failSafe.iterator();
		
		while(itrerator.hasNext()) {
			System.out.println(itrerator.next()+" , ");
			failSafe.remove(new String("R"));
		}
		

		Iterator<String> itrerator1 =failSafe.iterator();
		
		while(itrerator1.hasNext()) {
			System.out.println(itrerator1.next()+" , ");
			//failSafe.remove(new String("R"));
		}
		
		
	}

}

