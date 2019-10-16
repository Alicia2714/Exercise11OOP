package com.Exercise11OOP.model;

public class Perro {
	public int id;
	public String name;
	public String breed;
	public int age;
	public double height;
	
	
	public Perro() {}
	
	public Perro(int id, String name, String breed, int age, double height) {
		this.id=id;
		this.name=name;
		this.breed=breed;
		this.age=age;
		this.height=height;
	}
	
	public Perro(int id, String name) {
		this.id=id;
		this.name=name;
	}

}
