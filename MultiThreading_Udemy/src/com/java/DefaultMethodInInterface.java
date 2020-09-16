package com.java;

interface MyInterface{  
	 
    default void newMethod(){  
        System.out.println("Newly added default method"+MyInterface.class);  
    }  
    void existingMethod(String str);  
}  
interface MyInterface2 {  
	 
    default void newMethod(){  
        System.out.println("Newly added default method"+MyInterface2.class);  
    }  
    void disp(String str);  
} 
public class DefaultMethodInInterface implements MyInterface, MyInterface2{ 

	// implementing abstract methods
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public void disp(String str){
    	System.out.println("String is: "+str); 
    }
    
  //Implementation of duplicate default method
    public void newMethod(){  
        System.out.println("Implementation of default method");  
    }  
    
    public static void main(String[] args) {  
    	DefaultMethodInInterface obj = new DefaultMethodInInterface();
    	
    	//calling the default method of interface
        obj.newMethod();     
  
  
    }  
}