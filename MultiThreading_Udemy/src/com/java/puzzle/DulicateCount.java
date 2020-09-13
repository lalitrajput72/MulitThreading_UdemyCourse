package com.java.puzzle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DulicateCount {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(7,2,6,9,4,5,8,2,0,2,3,8,7,4,1,0,5,6,1,8,7);
		String str="asdasdacascsadasdasdasd";

		Map<Integer,Integer> map=new HashMap<>();
		/*
		 * for(Integer i : list) { map.put(i, i); }
		 */
		for(Integer i : list) {
		if(map.containsKey(i)) {
			map.put(i,(map.get(i)+1));
		}
		else {
			map.put(i, 1);
		}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("Number : "+entry.getKey()+"  :  Count : "+entry.getValue());
		}
	}

}
