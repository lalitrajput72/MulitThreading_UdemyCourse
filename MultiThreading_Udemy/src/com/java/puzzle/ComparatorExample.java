package com.java.puzzle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	
	public static void main(String[] args) {
	List<Person> set=new ArrayList<>();
		
		set.add(new Person(1,"Lalit"));
		set.add(new Person(2,"Tanvi"));
		set.add(new Person(3,"Ksttiz"));
		set.add(new Person(4,"Amit"));
		
		Collections.sort(set,new PersonIdComparator());
		
		System.out.println("Sorted by ID: "+set);
		
		Collections.sort(set, new PersonNameComparator());
		System.out.println("Sorted by Name: "+set);
	}

}

class PersonIdComparator implements Comparator<Person>{
	
	public int compare(Person p1,Person p2) {
		if(p1.getId()>p2.getId())
			return 1;
		else 
			return 0;
	}
}
class PersonNameComparator implements Comparator<Person>{
	
	public int compare(Person p1,Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
}
