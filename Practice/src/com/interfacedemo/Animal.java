package com.interfacedemo;

public class Animal implements Walkable,Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Animal can Run");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Animal can Walk");
	}

}
