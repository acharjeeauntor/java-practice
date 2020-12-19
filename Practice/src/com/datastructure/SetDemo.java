package com.datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SetDemo demo = new SetDemo();
		Set x= demo.createHashSet();
		Set y = demo.createLinkedHashSet();
		Set z = demo.createTreeSet();
		System.out.println("Hash Set");
		demo.printSet(x);
		System.out.println("Linked Set");
		demo.printSet(y);
		System.out.println("Tree Set");
		demo.printSet(z);
		

	}
	
	
	private Set createHashSet() {
		HashSet<Integer> setOfIntegers = new HashSet<>();
		setOfIntegers.add(100);
		setOfIntegers.add(1520);
		setOfIntegers.add(120);
		return setOfIntegers;
	}
	
	
private Set createLinkedHashSet() {
	LinkedHashSet<Integer> setOfIntegers = new LinkedHashSet<>();
	setOfIntegers.add(1000);
	setOfIntegers.add(10);
	setOfIntegers.add(12);
	return setOfIntegers;
	}

private Set createTreeSet() {
	TreeSet<Integer> setOfIntegers = new TreeSet<>();
	setOfIntegers.add(100);
	setOfIntegers.add(10);
	setOfIntegers.add(12);
	return setOfIntegers;
	}

private void printSet(Set setToprint) {
	Iterator setIterator = setToprint.iterator();
	while(setIterator.hasNext()) {
		System.out.println("Value: "+setIterator.next());
	}
}
	

}
