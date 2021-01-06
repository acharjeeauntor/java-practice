package com.datastructure;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fact(5));
	}
	
	public static int fact(int x) {
		if(x<=1){
			return 1;
		}else {
			return x*fact(x-1);
		}
		
	}

}
