package com.buildArray;


public class Main {

	public static void main(String[] args) {
	
		Array num = new Array(3);
		num.insert(10);
		num.insert(20);
		num.insert(30);
		num.print();
		num.removeAt(1);
		num.print();

		
	}

}
