package com.java.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class UnionAndInterSection {
	
	public static void main(String[] args) {
		
		int[] arr1={2, 3, 4, 7, 1};
		int[] arr2={4, 1, 3, 5};
		int[] arr3={8, 4, 6, 2, 1};
		int[] arr4={7, 9, 4, 1};
		
		List<int[]> list=new ArrayList<>();
		list.add(arr1);
		list.add(arr2);
		list.add(arr3);
		list.add(arr4);
		
		System.out.println(union(list));
		System.out.println(intersection(list));
		
	}
	
	public static Set<Integer> union(List<int[]> list){
		Set<Integer> set=new TreeSet<>();
		for(int[] arr : list) {
			for(int i=0;i<arr.length;i++) {
				set.add(arr[i]);
			}
		}
		return set;
	}
	public static Set<Integer> intersection(List<int[]> list) {
		
		Map<Integer,Integer> map=new TreeMap<>();
		for(int[] arr : list) {
			for(int i=0;i<arr.length;i++) {
				if(map.containsKey(arr[i])) {
					map.put(arr[i], (map.get(arr[i]))+1);
				}
				else {
					map.put(arr[i], 1);
				}
			}
		}
		Set<Integer> set=new TreeSet<>();
		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
			if(m.getValue() == list.size()) {
				set.add(m.getKey());
			}
		}
		return set;
	}
}
