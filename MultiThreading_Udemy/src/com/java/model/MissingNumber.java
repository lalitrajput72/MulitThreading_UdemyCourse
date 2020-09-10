package com.java.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MissingNumber {
	
	public static void main(String[] args) {
		int n=8;
		int[] arr1= {1, 4, 5, 3, 8, 6};
		System.out.println(missingNumber(arr1, n));
	}
	public static Set<Integer> missingNumber(int[] arr1,int n){	
		int[] arr2=new int[n];
		int temp=1;
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=temp;
			temp++;
		}
		List<int[]> list=new ArrayList<>();
		list.add(arr1);
		list.add(arr2);
		
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
			if(m.getValue() == 1) {
				set.add(m.getKey());
			}
		}
		return set;
	}
}
