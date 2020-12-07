package com.oopconcept;

public class MethodOveriding {
	
	public void display() {
		System.out.println("First");
	}
	
	public void display(int a) {
		System.out.println(a);
	}
	
	public void display(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOveriding mo =new MethodOveriding();
		mo.display();
		mo.display(5);
		mo.display("Auntor");

	}

}
