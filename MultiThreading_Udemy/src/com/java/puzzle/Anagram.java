package com.java.puzzle;

import java.util.Map;
import java.util.TreeMap;

public class Anagram {
	
	public static void main(String[] args) {
		
		String word="Hello";
		char[] wordChar=word.toCharArray();
		String[] arr= {"ellHo","ollHe","Helo","lolHe","LolHe","lloHe","olleH"};
		int count=0;
		
		Map<String,Integer> wordTreeMap=new TreeMap<>();
		
		for(char c : wordChar) {
			if(wordTreeMap.containsKey(c+"")) {
				wordTreeMap.put(c+"", (wordTreeMap.get(c+"")+1));	
			}
			else {
			wordTreeMap.put(c+"", 1);
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			
			char[] anArr=arr[i].toCharArray();
			Map<String,Integer> anaTreeMap=new TreeMap<>();
			for(char c : anArr) {
				if(anaTreeMap.containsKey(c+"")) {
					anaTreeMap.put(c+"", (anaTreeMap.get(c+"")+1));
				}
				else {
					anaTreeMap.put(c+"", 1);
				}
				
				if(wordTreeMap.equals(anaTreeMap)) {
					count++;
				}
			}
			
		}
		
		System.out.println(count);
		
	}

}
