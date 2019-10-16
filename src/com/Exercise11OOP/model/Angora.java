package com.Exercise11OOP.model;

public class Angora extends Cat {
	
	private double mouthLong;
	
	public Angora() {
		
	}
	
	public Angora(int id, String name, int age) {
	super(id, name, age);	
	}
	
	public Angora(int id, String name, int age, double mouthLong) {
		super(id, name, age);
		this.mouthLong = mouthLong;
	}
	
	//Setters Getters
	
	public double getMouthLong() {
		return mouthLong;
	}
	
	public void setMouthLong() {
		this.mouthLong = mouthLong;
	}
	
	public String ToString() {
		return "Id:["+getId()+"], name:["+getName()+"], age:["+getAge()+"], mouthLong: ["+mouthLong+"]";
	}

	@Override
	public void Miow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Scratch() {
		// TODO Auto-generated method stub
		
	}

}
