package com.java.model;

public class BlockTest {
 static int a;
 static String b;
 BlockTest(){
	 a=100;
	 b="a10";
 }
 static {
	 a=10;
	 b="aaa";
 }
 public
  		static void main(String[] args) {
	//System.out.println(new Test1().a+" : "+new Test1().b);
	 boolean b1=true;
	 boolean b2=new Aa().get(b1);
	 System.out.println(b1+":"+b2);
	 
	 String s = "foo";
	 Object o = (Object)s;
	 if (s.equals(o))
	 {
	 System.out.print("AAA");
	 }
	 else
	 {
	 System.out.print("BBB");
	 }
	 if (o.equals(s))
	 {
	 System.out.print("CCC");
	 }
	 else
	 {
	 System.out.print("DDD");
	 } 
}
}

class Aa{

public boolean get(boolean b1) {
	b1=true;
	return b1;
}
}
