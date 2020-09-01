package com.java.puzzle;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AvizvaTest2 
{
	/*
	 * public static void main(String[] args) { int sum = 0; int a = 3; while(sum++
	 * < 3) { int b = (1 + 2 * sum) % 3; switch(b) { default: case 0: a -= 1; break;
	 * case 1: a += 5; } } System.out.println(a); }
	 */
	
	/*
	 * public static void main(String[] args) { int count = 0; int a = 3;
	 * while(count++ < 3) { int b = (1 + 2 * count) % 3; switch(b) { default: case
	 * 0: a -= 1; break; case 1: a += 5; } } System.out.println(a); }
	 */
	
	public static void main(String args[]) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
			list.add(-8);
			list.add(10);
			list.add(-20);
			list.add(null);
		Comparator<Integer> r = Collections.reverseOrder();
		Collections.sort(list, r);
		for(int i : list)
		System.out.print(i+ " ");
		System.out.println();
	}
}
