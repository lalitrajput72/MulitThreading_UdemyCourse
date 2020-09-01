package com.java.puzzle;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int[][] arr=new int[4][5];
		
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col]=row*col;
			}
		}
		
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+"  ");
			}
			System.out.println();
		}
	}
}
