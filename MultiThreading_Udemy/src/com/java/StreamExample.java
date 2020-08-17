package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(8);
		list.add(10);
		list.add(3);
		list.add(2);
		System.out.println("Before List is : "+list);
		List<Integer> list2=list.stream().filter(l->list.remove(l)).collect(Collectors.toList());
		System.out.println("After list is : "+list);
		System.out.println("List2 is : "+list2);
		
	}

}
