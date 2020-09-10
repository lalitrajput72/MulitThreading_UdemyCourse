package com.java.model;

public class Test {
	int a=1;
	static int b=2;
	
	public static void main(String[] args) {
		
		/*
		 * Test t=new Test(); t.a=100; t.b=20; Test t2=new Test();
		 * System.out.println(t.a+" :"+t.b+" :"+t2.a+" :"+t2.b);
		 */
		System.out.println(new B().get());
		
	}

}

class A{
	int a=1;
	A(){
		a=3;
	}
	int get() {
		return this.a;	
	}
}
class B extends A{
	int a=1;
	B(){
		a=2;
	}
	int get() {
		return a;
	}
}