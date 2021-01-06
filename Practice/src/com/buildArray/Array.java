package com.buildArray;

public class Array {
private int[] items;
private int count;
	
	public Array(int length) {
		items=new int[length];
	}
	
	public void print() {
		for(int i=0;i<count;i++) {
			System.out.println(items[i]);
		}
	}
	
	public void insert(int item) {
		
		
		if(items.length==count) {
		int[]newItems=new int[count*2];
		for(int i=0;i<count;i++) {
			newItems[i]=items[i];
		}
		items=newItems;
		}
		
		
		
		items[count++]=item;
	}
	
	public void removeAt(int index) {
		System.out.println("Remove At Start");
		if(index<0 || index>=count)
		 throw new IllegalArgumentException();
		
		for(int i=index;i<count;i++) {
			items[i]=items[i+1];
			System.out.println("new:"+items[i]);
		}
		count--;
	}

	
	
	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
