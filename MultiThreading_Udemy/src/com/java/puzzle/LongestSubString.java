package com.java.puzzle;

import java.util.LinkedHashMap;

public class LongestSubString {

	public static void main(String[] args) {
		
		Integer testCase = 2;  
        String[] str= {"3","15"};
        //System.out.println(str.toString());
        int j=0;
        
        while(j<testCase){
        for(int i=1;i<=Integer.valueOf(str[j]);i++){
        	
        	if(!((Integer.valueOf(i)%3==0)) && !((Integer.valueOf(i)%5==0))){
            System.out.println(i);
            }
        else if(((Integer.valueOf(i))%3)==0){
            if(((Integer.valueOf(i))%5)==0){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println("Fizz");
            }
        }
        else if(((Integer.valueOf(i))%5==0)){
        System.out.println("Buzz");
        }
     
            }
           j++;
        }
 
	    }
}
