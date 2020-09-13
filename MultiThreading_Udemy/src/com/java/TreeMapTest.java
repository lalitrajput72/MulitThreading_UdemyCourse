package com.java;


import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Dinesh.Rajput
 *
 */

class Key implements Comparable<Key>{
	
	String name;
	
	public Key(String name) {
		this.name=name;
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public int compareTo(Key o) {
		return this.getName().compareTo(o.getName());
	}
	
}
public class TreeMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NavigableMap<Key, String> treemap = new TreeMap<>();
                treemap.put(new Key("Anamika"), "Anamika");
		treemap.put(new Key("Rushika"), "Rushika");
		treemap.put(new Key("Dinesh"), "Dinesh");
		treemap.put(new Key("Arnav"), "Arnav");
	
	System.out.println(treemap.descendingMap());
	
	}
	

}