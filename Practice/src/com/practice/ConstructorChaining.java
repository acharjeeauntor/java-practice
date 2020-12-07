package com.practice;

public class ConstructorChaining {
	
	
	public String name;
	public int age;
	
	ConstructorChaining(){
		this("Auntor");
	}
	
	
	ConstructorChaining(String name){
		this(name,23);
	}
	
ConstructorChaining(String name,int age){
		this.name=name;
		this.age=age;
	}
	
void disp() {
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining cc = new ConstructorChaining();
		cc.disp();
		

	}

}
