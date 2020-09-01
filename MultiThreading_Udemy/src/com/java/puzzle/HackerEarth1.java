package com.java.puzzle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Minimum cost to convert N into M by adding divisor
public class HackerEarth1 {
	
	   static int solve(int N, int M){
	       // Write your code here
	        int cost=0;
	       while(N!=M & N<M){
	           if(N%2==0){
	           List<Integer> divisor =new ArrayList<>();
	           for(int i=2;i<=(N/2);i+=2){
	               if(N%i==0){
	                   divisor.add(i);
	               }
	           }
	           Collections.sort(divisor);
	           N=N+divisor.get(divisor.size()-1);
	           cost=cost+(N/(divisor.get(divisor.size()-1)));
	           }
	           else{
	               return -1;
	           }
	       }
	       return cost;
	    }
	   
	   public static void main(String[] args) {
		System.out.println(solve(6,24));
		
	}

}
