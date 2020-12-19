package com.interfacedemo;

public class InterfaceExtend implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExtend obj = new InterfaceExtend();
		obj.walk();
		obj.run();
		
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Walk");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run");
	}

}
