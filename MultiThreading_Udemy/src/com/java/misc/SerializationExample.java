package com.java.misc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee e1=new Employee(1, "Amit");
		Employee e2=new Employee(2, "Lalit");
		Employee e3=new Employee(3, "Kshittiz");
		
		FileOutputStream fout=new FileOutputStream("output.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(e1);
		out.writeObject(e2);
		out.writeObject(e3);
		out.flush();
		out.close();
		System.out.println("Serialization is done.");
		
		//Deserialize Object
		
		FileInputStream fin=new FileInputStream("output.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		Employee er1=(Employee)oin.readObject();
		Employee er2=(Employee)oin.readObject();
		Employee er3=(Employee)oin.readObject();
		
		System.out.println("Deserialization is complete.PFB your Employee details");
		
		System.out.println("Id : "+er1.getId()+" , Name :"+er1.getName());
		System.out.println("Id : "+er2.getId()+" , Name :"+er2.getName());
		System.out.println("Id : "+er3.getId()+" , Name :"+er3.getName());
		oin.close();
	}

}
