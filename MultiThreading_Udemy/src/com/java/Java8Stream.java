package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java.model.Person;

public class Java8Stream {

	public static void main(String[] args) {
		
		List<Person> person=Arrays.asList(
				new Person("Henery","Cavil","USA"),
				new Person("Tom","Cruze","USA"),
				new Person("Jim","Carry","Canada"),
				new Person("Hritik","Roshan","India")
				);
		
		person.forEach(p->System.out.println(p.getName()));
		
		//Use Stream API
		person.stream().filter(p->p.getLastName().startsWith("C")).forEach(p->System.out.println(p));
		List<Person> collected=person.stream().filter(p->p.getLastName().startsWith("C")).collect(Collectors.toList());
		System.out.println(collected);
	}
}
