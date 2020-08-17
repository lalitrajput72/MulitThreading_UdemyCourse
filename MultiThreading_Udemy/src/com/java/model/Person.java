package com.java.model;

public class Person {

	String name;
	String lastName;
	String country;
	
	
	public Person(String name, String lastName, String country) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", country=" + country + "]";
	}
	
	
}
