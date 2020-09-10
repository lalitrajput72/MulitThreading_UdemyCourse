package com.java;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
public static void main(String[] args) {
	List<Integer> arrList = new ArrayList<Integer>();
    arrList.add(10);
    arrList.add(20);
    arrList.add(30);
     arrList.add(40);
     
     for(int i=0,j=arrList.size()-1;i<arrList.size()/2 & j>arrList.size()/2;i++,j--) {
			/*
			 * for(int j=i+1;j<arrList.size();j++) { if(arrList.get(i)*arrList.get(j)==400)
			 * { System.out.println(arrList.get(i)+" : "+arrList.get(j)); } }
			 */
    	 if(arrList.get(i)*arrList.get(j)==400)
			   System.out.println(arrList.get(i)+" : "+arrList.get(j)); 
     }
}
}
