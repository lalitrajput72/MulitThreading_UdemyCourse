package com.java.puzzle;

public class StringPuzzle {
	
	public static void main(String[] args) {
		
		String s1="hill";
		String s2="hill5";
		String s3="5";
		
		//s1=s1.concat(s3);
		//s1=s1+s3;
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		/*
		 * m1(s1); System.out.println(s1==s2);
		 */
	}
	
	public static String m1(String s1) {
		s1="hill".concat("5");
		return s1;
	}

}
