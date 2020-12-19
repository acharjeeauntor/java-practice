package com.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List newList=new ArrayListDemo().createArrayListForDemo();
new ArrayListDemo().printArrayListDemo(newList);
	}
	
	
	private List createArrayListForDemo() {
		
	List<String> cars =new ArrayList<>();
	cars.add("BMW");
	cars.add("Auntor");
	
	return cars;
		
	}
	
	private void printArrayListDemo(List list) {
		Iterator listIterator = list.iterator();
		while(listIterator.hasNext()) {
			System.out.println("Print the value in the list: "+listIterator.next());
		}
	}
	

}
