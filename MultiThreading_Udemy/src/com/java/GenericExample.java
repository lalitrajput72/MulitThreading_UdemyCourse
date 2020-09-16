package com.java;


class Testing<T>{
	
	T obj;
	
	public Testing() {
		
	}
	
	public Testing(T obj) {
		this.obj=obj;
	}
	
	public T getObject() {
		return this.obj;
	}
	
	public void print(T obj) {
		System.out.println(obj.getClass().getName()+" : "+obj);
	}
}

public class GenericExample {

	public static void main(String[] args) {
		Testing<Integer> test=new Testing<>(15);
		System.out.println(test.getObject());
		Testing<String> str=new Testing<>();
		str.print("Hello");
	}
}
