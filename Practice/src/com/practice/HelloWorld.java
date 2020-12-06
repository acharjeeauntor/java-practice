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
	
	
	public int addNumber(int a,int b) {
		int result = a+b;
		return result;
		
	}
	
	//Method Overloading  -Method name same but parameter different
	public int addNumber(int a,int b,int c) {
		int result = a+b+c;
		return result;
		
	}
	
	
	public static void main(String[] args) {
	  System.out.println("Hello World");
	 

	 HelloWorld hello = new HelloWorld();
	 hello.nonstaticmethod();
	 hello.instanceVariable=30;
	 staticmethod();
	  HelloWorld.staticVariable=100;
	  int AddTwoNumber = hello.addNumber(10, 20);
	  System.out.println("The Addition of Two Number is:"+AddTwoNumber);
	  int AddThreeNumber = hello.addNumber(10, 20,20);
	  System.out.println("The Addition of Three Number is:"+AddThreeNumber);
	  
	}

}
