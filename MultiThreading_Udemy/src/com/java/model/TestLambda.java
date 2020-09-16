package com.java.model;

interface Any{
	 
	 public String print(String s);
}
public class TestLambda{
	 
	 public static void main(String[] args) {
		 String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};
		 Any any=(s)->{
			 if(s.startsWith("A")){
				return s;
			 }
			 else {
				 return "";
			 }
		 };
		 for(String str : arr){
		   System.out.println(any.print(str));
		 }
	}	 
}
