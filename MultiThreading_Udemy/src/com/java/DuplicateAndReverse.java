package com.java;

import java.util.HashMap;
import java.util.Map;

public class DuplicateAndReverse {

	public static void main(String[] args) {

		String string="Hello World";
		int[] array= {1,2,5,7,0,4,9,2,3,1,7,2,5,6,9,1,4,3,8,8};
		reverseString(string);
		duplicateCharacterInAString(string);
		duplicateElementInAnArray(array);
	}
	
	public static void reverseString(String string) {
		
		char[] array=string.toCharArray();
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]);
		}
		System.out.println();
	}

	public static void duplicateCharacterInAString(String string) {
		
		Map<String,Integer> map=new HashMap<>();
		char[] array=string.toCharArray();
		for(int i=0;i<array.length;i++) {
			if(map.containsKey(String.valueOf(array[i]))) {
				map.put(String.valueOf(array[i]), map.get(String.valueOf(array[i]))+1);
			}
			else {
				map.put(String.valueOf(array[i]), 1);
			}
		}
		
		map.entrySet().stream().forEach(p->System.out.println(p.getKey()+"  ::  "+p.getValue()));
		System.out.println();
		
	}
	
	public static void duplicateElementInAnArray(int[]  array) {
		
		Map<Integer,Integer> map=new HashMap<>();
		for(Integer i : array) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
		map.entrySet().stream().forEach(m->System.out.println(m.getKey()+"  ::  "+m.getValue()));
		System.out.println();
	}
}
