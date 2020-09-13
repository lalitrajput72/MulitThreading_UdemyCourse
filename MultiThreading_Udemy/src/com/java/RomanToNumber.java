package com.java;

import java.util.*; 

public class RomanToNumber { 

	int romanValue(char r) 
    { 
        if (r == 'I') 
            return 1; 
        else if (r == 'V') 
            return 5; 
        else if (r == 'X') 
            return 10;
        else if (r == 'L')
            return 50;  
        return -1; 
    } 
  
    int romanToDecimal(String str) 
    { 
    	int value = 0; 
        for (int i = 0; i < str.length(); i++) { 
            int s1 = romanValue(str.charAt(i)); 
            if (i + 1 < str.length()) { 
                int s2 = romanValue(str.charAt(i + 1)); 
                if (s1 >= s2) { 
                    value = value + s1; 
                } 
                else { 
                    value = value + s2 - s1; 
                    i++; 
                } 
            } 
            else { 
                value = value + s1; 
                i++; 
            } 
        } 
        return value; 
    } 
    
   
} 