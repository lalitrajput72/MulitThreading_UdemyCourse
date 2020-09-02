package com.java.puzzle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KronosDemo {

	// Compile Time Polymorphism

		int i;
		public KronosDemo(int i) {
		super();
		this.i = i;
	}
		public KronosDemo() {
			super();
		}


		public static void main(String[] args){
			
			
			/*
			 * List<Memory> list=new ArrayList<>(); for(int i=0 ; i>-1;i++){ list.add(new
			 * Memory()); }
			 */
			List<KronosDemo> list=new ArrayList<>();
			Map<KronosDemo,Integer> m=new HashMap<>();
			for(int i=0 ; i>-1;i++){
				
				KronosDemo k=new KronosDemo();
				m.put(k, i);
				System.out.println(i);
			}
			
			KronosDemo test=new KronosDemo();
			test.sum(5,3);
			
			Parent p=new Parent();
			Parent c=null;
			p.move();
			c.move();
		}
		
		public int sum(int a , int b){
			return a+b;
		}
		public String sum(String a, String b){
			return a+b;
		}	
			
}

	// Runtime Polymorphism
	class Parent{
		public static void move(){
			System.out.println("Parent");
		}
	}

	class Child extends Parent{
		public static void move(){
			System.out.println("Child");
		}
	}

