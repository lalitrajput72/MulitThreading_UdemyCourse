package com.java;

import java.util.Map;
import java.util.TreeMap;

import javax.print.attribute.standard.Finishings;

public class CompareArrayAndFibbonaci {

	
	public static int compareArray(int[] arr1, int[] arr2) {
		
		Map<Integer,Integer> map=new TreeMap<>();
		if(arr1.length>arr2.length) {
			for(int i : arr2) {
				if(map.containsKey(i)) {
					map.put(i, map.get(i)+1);
				}
				else {
					map.put(i, 1);
				}
			}
			
			for(int j : arr1) {
				if(!map.containsKey(j)) {
					return j;
				}
			}
		}
		else if(arr2.length>arr1.length) {
			for(int i : arr1) {
				if(map.containsKey(i)) {
					map.put(i, map.get(i)+1);
				}
				else {
					map.put(i, 1);
				}
			}
			
			for(int j : arr2) {
				if(!map.containsKey(j)) {
					return j;
				}
			}
		}
		 return 0;
	}
	
	public static int compareArrayWithoutColl(int[] arr1, int[] arr2) {
		
		int sum1=0;
		int sum2=0;
		if(arr1.length>arr2.length) {
		for(int i=0;i<arr1.length;i++) {
			sum1=sum1+arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++) {
			sum2=sum2+arr2[i];
		}
		
		return sum1-sum2;
		}
		else if(arr2.length>arr1.length) {
				for(int i=0;i<arr2.length;i++) {
					sum2=sum2+arr2[i];
				}
				
				for(int i=0;i<arr1.length;i++) {
					sum1=sum1+arr1[i];
				}
				
				return sum2-sum1;
	}
	
		return 0;
		
	}
	
	
	public static void fibbonaci(int n) {
		
		int n1=0;
		int n2=1;
		int sum=0;
		for(int i=1;i<=n;++i) {
			
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		int[] arr2= {2,3};
		
		//System.out.println(compareArray(arr1,arr2));
		//System.out.println(compareArrayWithoutColl(arr1,arr2));
		fibbonaci(10);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
