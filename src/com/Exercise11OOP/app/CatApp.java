package com.Exercise11OOP.app;

import com.Exercise11OOP.model.Cat;
import com.Exercise11OOP.model.Angora;
import com.Exercise11OOP.model.Persa;

public class CatApp {

	public static void main(String[] args) {
		
		Cat michi = new Persa();
		michi = new Angora();
		
		michi.setId(1);
		michi.setName("Michi");
		michi.setAge(3);
		
		System.out.println("Michi's id: " +michi.getId());
		System.out.println("Michi's name: " +michi.getName());
		System.out.println("Michi's age: " +michi.getAge());
		
		System.out.println("");
		
		Angora tom = new Angora(2, "Tom", 4, 3.2);
		System.out.println(tom.ToString());
		
		

	}

}
