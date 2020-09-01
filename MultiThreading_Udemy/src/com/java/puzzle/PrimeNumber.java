package com.java.puzzle;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int number =323;
		boolean flag=false;
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
	}

}
