package com.java;

import java.util.Arrays;

public class BinarySearchExample{  

	public static void binarySearch(int arr[], int key){  
		
		Arrays.sort(arr);
		int firstIndex=0;
		int lastIndex=arr.length-1;
		
		int middleElement = (firstIndex + lastIndex)/2;  
	   while( firstIndex <= lastIndex ){  
	      if ( arr[middleElement] < key ){  
	        firstIndex = middleElement + 1;     
	      }
	      else if ( arr[middleElement] == key ){  
	        System.out.println("Key Found at Position : " + middleElement);  
	        break;  
	      }else{  
	         lastIndex = middleElement - 1;  
	      }  
	      middleElement = (firstIndex + lastIndex)/2;  
	   }  
	   if ( firstIndex > lastIndex ){  
	      System.out.println("Key doesn't exist in given Array!");  
	   }  
	 }  
	 public static void main(String args[]){  
	        int arr[] = {10,20,30,40,50};  
	        
	        binarySearch(arr,60);     
	 }  
	}  
