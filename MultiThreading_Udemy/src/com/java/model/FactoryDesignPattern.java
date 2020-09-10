package com.java.model;

public class FactoryDesignPattern {
	public static void main(String[] args) {
		String car="Audi";
		if(car.equals("Audi")) {
			new Audi().logo();
		}
	}
}
interface Car{
	public void logo();
}
class Audi implements Car{
	@Override
	public void logo() {
		System.out.println("Inside Audi Logo");
	}
}
class BMW implements Car{
	@Override
	public void logo() {
		System.out.println("Inside BMW Logo");
	}
}
class Mercedez implements Car{
	@Override
	public void logo() {
		System.out.println("Inside Mercedez Logo");
	}
}
