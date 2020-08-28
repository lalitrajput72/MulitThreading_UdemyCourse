package com.java.puzzle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample{
	
	public static void main(String[] args) {
		
		List<Person> set=new ArrayList<>();
		
		set.add(new Person(1,"Lalit"));
		set.add(new Person(2,"Tanvi"));
		set.add(new Person(3,"Ksttiz"));
		set.add(new Person(4,"Amit"));
		
		System.out.println(set);
		Collections.sort(set);
		
		System.out.println(set);
		
		
	}


}
