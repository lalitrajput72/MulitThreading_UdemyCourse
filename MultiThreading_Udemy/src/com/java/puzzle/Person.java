package com.java.puzzle;

public class Person implements Comparable<Person> {

	int id;
	String name;
	
	
	public Person() {
		super();
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	public int compareTo(Person p) {
		return this.name.compareTo(p.name);
	}
	
}
