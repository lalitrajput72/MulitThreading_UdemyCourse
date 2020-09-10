package com.sapient;

public class InheritanceDemo {
	public static void main(String[] args) {
		/*
		 * Parent p=new Parent(); Parent c=new Child();
		 * 
		 * p.any(); c.any(); System.out.println(p.a); System.out.println(c.a);
		 */
		Child c=new Child();
	}
}

class Parent{
	 static
	    {
	        System.out.println('A');
	    }
	 
	    {
	        System.out.println('B');
	    }
	 
	    public Parent()
	    {
	        System.out.println('C');
	    }
}

class Child extends Parent{
	 static
	    {
	        System.out.println('D');
	    }
	 
	    {
	        System.out.println('E');
	    }
	 
	    public Child()
	    {
	        System.out.println('F');
	    }
}