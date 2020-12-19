package com.abstractdemo;

public abstract class Shape {

	
	abstract float area();
	
	public void display(float area) {
		System.out.println("Area: "+area);
	}
	
}

