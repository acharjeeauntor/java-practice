package com.practice;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Single Dimensional Array
				
				//New Operator
				int [] a=new int [5];
				System.out.println(a.length);
				// array initializer
				int [] b= {1,2,3,5,6};
				System.out.println(b[1]);
				
				for(int i:b) {
					System.out.println(i);
				}
				
				
				
		// Multi Dimensional Array
			int [][] c = new int[5][7];
			System.out.println(c.length);
			
			//2*3
			int [][] d= {
					{1,2},
					{3,5},
					{6,3}
					};
			
			System.out.println(d[2][1]);
			
			
			
			
		
		
	}

}
