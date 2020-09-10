package com.java;

class Test2{
	final int m;
	
	public Test2(int m) {
		this.m=m;
	}
	
	public static void main(String[] args){
		int arr[] ={1,2,3,3,4,4,5,6,6};
		Thread t1=new Thread(()->{
			for(int i=0;i<arr.length;i++){
				if(arr[i]%2 == 0){
					System.out.println("Even Number : "+arr[i]);
				}
				else{
					System.out.println("Odd Number : "+arr[i]);
				}
			}
		});
		
		t1.start();
	}
	
}