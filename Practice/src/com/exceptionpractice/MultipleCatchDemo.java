package com.exceptionpractice;

public class MultipleCatchDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int a=10;
			int b=5;
			int c= a/b;
			int d[]= {1,3,5,7};
			
			System.out.println(d[10]);
			
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occure");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexoutOfBounds Exception occure");
			
		}catch(Exception e) {
			System.out.println(" Exception occure");
			
		}

	}

}
