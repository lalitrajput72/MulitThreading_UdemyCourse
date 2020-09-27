package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

interface Testt{
	public int test(int i);
}
public class StreamExample {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(8);
		list.add(10);
		list.add(3);
		list.add(2);
		
		list.stream().filter(l->l>5).forEach(l->System.out.print(l));
		
		Testt t= (x)->2*x;
		
		System.out.println(t.test(500));
		/*
		 * System.out.println("Before List is : "+list); List<Integer>
		 * list2=list.stream().filter(l->list.remove(l)).collect(Collectors.toList());
		 * System.out.println("After list is : "+list);
		 * System.out.println("List2 is : "+list2);
		 */
		
		Map<Integer , String> map=new HashMap<>();
		map.put(1, "Hello");
		map.put(2, "H");
		map.put(3, null);
		map.put(4, "L");
		map.put(5, null);
		map.put(6, "O");
		
		System.out.println(map.entrySet().stream().filter(m->m.getValue() != null).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue)));
		
		/*
		 * Map<Integer,String> m = map.entrySet().stream().filter(ma -> ma.getValue() !=
		 * null).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		 * 
		 * System.out.println(m);
		 */
		
	}

}
