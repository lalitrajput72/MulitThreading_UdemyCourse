package com.sapient;

public class PolymorphismDemo {
	
	public static void main(String[] args) {
		
		new PolymorphismDemo().print(null);
	}
	
	public void print() {
		
	}
	
	public int print(int i) {
		return i;
	}
	
	public void print(String s) {
		System.out.println("String :"+s);
	}
	public void print(Object o) {
		System.out.println("Object :"+o);
	}

}
