package com.java;

import java.util.HashMap;
import java.util.Map;

public class Test3 {

	public static void main(String[] args) {
		System.out.println(CheckString("mnop", "zmtornp"));
		System.out.println(CheckString("mnopp", "zmtornp"));
	}
	
	public static boolean CheckString(String s1, String s2) {
		
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		Map<String , Integer> map1=new HashMap<>();
		Map<String , Integer> map2=new HashMap<>();
		
		for(int i=0;i<arr1.length;i++) {
			if(map1.containsKey(arr1[i]+"")){
				map1.put(arr1[i]+"", (map1.get(arr1[i]+"")+1));
			}
			else {
				map1.put(arr1[i]+"", 1);
			}
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(map2.containsKey(arr2[i]+"")){
				map2.put(arr2[i]+"", (map2.get(arr2[i]+"")+1));
			}
			else {
				map2.put(arr2[i]+"", 1);
			}
		}
		boolean flag=false;
		for(Map.Entry<String, Integer> m : map1.entrySet()) {
			
			if(map2.containsKey(m.getKey()) && map2.get(m.getKey()) >= m.getValue()) {
				flag=true;
			}
			else {
				flag=false;
				break;
			}
		}
		
		return flag;
	}
}
