package com.practice;

public class loopPractice {

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		hello.staticmethod();
		
// For Loop
		
		//1:
		System.out.println("For Loop practice:1 \n");
		
		for(int i=0;i<=10;i++) {
			if(i==8) {
				break;
			}
			System.out.println(i);
		}
		
		
		//2:
		System.out.println("For Loop practice:2 \n");
		for(int i=1;i<=10;i++) {
			System.out.println("5*"+i+"="+(5*i));
		}
		
		
		
		//3:
		System.out.println("For Loop practice:3 \n");
		Integer[] array = {10,5,6,9};
		for(int i:array) {
			System.out.println(i+"/2="+(i/2));
		}

// While Loop
		System.out.println("While Loop practice \n");	
		
		int i=1;
		while(i<=10) {
		System.out.println(i);
		i++;
		}
		
		
// Do While Loop
				System.out.println("Do While Loop practice \n");	
				
				int j=1;
				
				do {
				System.out.println(j);
				j++;
				}while(j<=10);
				
				
				
		
		
	}

}