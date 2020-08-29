package com.java.puzzle;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String str="100001";
		char[] arr=str.toCharArray();
		
		for (int i = 0,j=arr.length-1; i <= (arr.length/2) & j >= ((arr.length)/2) ; i++ ,j--) {
			if((arr[i]+"").equals(arr[j]+"")) {
				if(i==j || ((j-i)==1)) {
					System.out.println("Palindrome");
				}
			}
			else {
				System.out.println("Not palindrome");
			}
		}
	}

}
