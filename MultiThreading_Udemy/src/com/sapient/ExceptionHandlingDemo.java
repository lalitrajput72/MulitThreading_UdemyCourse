package com.sapient;

public class ExceptionHandlingDemo {
	
	public static int any() {
		try {
			return 10/0;
		}
		catch(Exception e) {
			return 20;
		}
		finally {
			return 30;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(any());
	}

}
