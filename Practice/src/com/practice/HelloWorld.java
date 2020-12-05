package com.practice;

public class HelloWorld {
	
//	static int x=10;
	private int instanceVariable=10;
	 static int staticVariable=30;

	private void nonstaticmethod() {
		 //x=11;
		int localVariable = 20;
		System.out.println("Non static method");
	}
	
	public static void staticmethod() {
		//x=20;
		System.out.println("static method");
	}
	
	
	public int addTwoNumber(int a,int b) {
		int result = a+b;
		return result;
		
	}
	
	
	
	public static void main(String[] args) {
	  System.out.println("Hello World");
	 

	 HelloWorld hello = new HelloWorld();
	 hello.nonstaticmethod();
	 hello.instanceVariable=30;
	 staticmethod();
	  HelloWorld.staticVariable=100;
	  int res = hello.addTwoNumber(10, 20);
	  System.out.println("The Addition of Two Number is:"+res);
	  
	}

}