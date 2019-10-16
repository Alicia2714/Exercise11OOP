package com.Exercise11OOP.app;

import com.Exercise11OOP.model.Perro;

public class PerroApp {

	public static void main(String[] args) {
		Perro pluto = new Perro();
		
		System.out.println("Plutos age: "+ pluto.age);
		System.out.println("Pluto's height: "+pluto.height);
		
		Perro firulais = new Perro(1, "Firulais", "Labrador", 5, 60.0);
		System.out.println("Firulais age: " + firulais.age);
		System.out.println("Firulais breed: " + firulais.breed);
		

	}

}
