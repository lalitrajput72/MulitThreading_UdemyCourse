package com.java.model;

import java.util.HashMap;
import java.util.Map;

public class TestPro {

	public static void main(String[] args) {
		
		String[] a = {"Lalit:Red","Amit:Red","Sumit:Green"};
		
		Map<String,Integer> map=new HashMap<>();
		for(String str : a) {
			String[] arr=str.split(":");
			if(map.containsKey(arr[1])) {
				map.put(arr[1], (map.get(arr[1])+1));
			}
			else {
				map.put(arr[1], 1);
			}
			
		}
		int temp=0;
		String color=null;
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			//System.out.println("Colour : "+m.getKey()+"");
			if(m.getValue()>temp) {
				temp=m.getValue();
				color=m.getKey();
			}
		}
		
		System.out.println(color+" : "+temp);
	}
	

}
