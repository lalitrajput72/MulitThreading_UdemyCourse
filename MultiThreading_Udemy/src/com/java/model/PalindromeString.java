package com.java.model;

public class PalindromeString { 
	  
    // Function that returns true if 
    // str is a palindrome 
    static boolean isPalindrome(String str) 
    { 
    	 boolean notPalindrome = false;
    	    String string = "Doc, note, I dissent. A fast never prevents a fatness. I diet on cod";

    	    string = string.replaceAll("[^a-zA-Z]+","").toLowerCase();

    	    char[] array = string.toCharArray();
    	    for(int i=0, j=array.length-1; i<j; i++, j--) {
    	        if(array[i] != array[j]) {
    	            notPalindrome = true;
    	            break;
    	        }
    	    }
    	    System.out.println(string + " is palindrome? " + !notPalindrome);
    	    return !notPalindrome;
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "Noel - sees leoN"; 
  
        if (isPalindrome(str)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
} 