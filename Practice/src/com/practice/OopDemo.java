package com.practice;

public class OopDemo {
	
	int a;
	
	OopDemo(){
		this.a=10;
	}
	
	OopDemo(int value){
		this.a=value;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OopDemo o1 = new OopDemo();
		System.out.println(o1.a);
		
		OopDemo o2 = new OopDemo(30);
		System.out.println(o2.a);
		
		
	}

}
