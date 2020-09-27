package com.java.misc;

public class BinaryToDecimalExample{  
	
	public static void main(String args[])
	{  //Print number of step taken to make a decimal number zero if even divide by 2 if odd subtract 1.  
		String binaryString="011100";  
		int decimal=Integer.parseInt(binaryString,2);  
		int count=0;
		while(decimal>0){
			if(decimal%2 ==0){
				count++;
				decimal=decimal/2;
			}
			else{
				count++;
				decimal=decimal-1;
			}
		}
		System.out.println(count);
	}
}  
