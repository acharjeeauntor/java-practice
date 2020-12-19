package com.exceptionpractice;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a =50;
		int b=0;
		
		try{
			
		if(b==0) {
			throw new Exception("Divide by zero causes an exception");
		}
		
		int c =a/b;
		System.out.println("Result is "+c);
			
		}
	catch(Exception e) {
		System.out.println("Exception is"+e);
	}
		
		
	}

}
