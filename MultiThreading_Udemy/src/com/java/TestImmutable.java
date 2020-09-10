package com.java;

import java.util.Date;

final class Student 
{ 
    final String name; 
    final int regNo; 
    final Date d;
  
    public Student(String name, int regNo,Date d) 
    { 
        this.name = name; 
        this.regNo = regNo; 
        this.d=d;
    } 
    public String getName() 
    { 
        return name; 
    } 
    public int getRegNo() 
    { 
        return regNo; 
  
    }
	public Date getD() {
		return d;
	}
    
    }

public class TestImmutable
{ 
    public static void main(String args[]) 
    { 
        Student s = new Student("ABC", 101,new Date("01 SEP 2019")); 
        
        System.out.println(s.getName()); 
        System.out.println(s.getRegNo());
        System.out.println(s.getD()); 
        
        int d=s.getRegNo();
        d=200;
        System.out.println(s.getRegNo());
        // Uncommenting below line causes error 
        // s.regNo = 102; 
    } 
} 