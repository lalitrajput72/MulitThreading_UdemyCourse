package com.java.model;

public class SingletonClass {
	
	private static SingletonClass object=null;
	private SingletonClass() {	
	}
	public static SingletonClass getInstance() {
		if(object==null) {
			object=new SingletonClass();
		}
		return object;
	}

}
