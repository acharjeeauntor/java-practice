package com.datastructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapDemo demo = new HashMapDemo();
		Map<Integer,String> x = demo.createHashMap();
		Map<Integer,String> y = demo.createLinkedHashMap();
		Map<Integer,String> z = demo.createTreeMap();
		System.out.println("Hash Map");
		demo.printMap(x);
		System.out.println("Linked Hash Map");
		demo.printMap(y);
		System.out.println("Tree Map");
		demo.printMap(z);

	}

	
	private Map<Integer,String> createHashMap(){
		Map<Integer,String> empMap = new HashMap();
		empMap.put(1, "Auntor");
		empMap.put(2, "Asif");
		empMap.put(11, "Auntor");
		empMap.put(52, "Asif");
		empMap.put(100, "Auntor");
		empMap.put(263, "Asif");
		return empMap;
	}
	
	
	private Map<Integer,String> createLinkedHashMap(){
		Map<Integer,String> empMap = new LinkedHashMap();
		empMap.put(1, "Auntor");
		empMap.put(2, "Asif");
		empMap.put(11, "Auntor");
		empMap.put(52, "Asif");
		empMap.put(100, "Auntor");
		empMap.put(263, "Asif");
		return empMap;
	}
	
	private Map<Integer,String> createTreeMap(){
		Map<Integer,String> empMap = new TreeMap();
		empMap.put(1, "Auntor");
		empMap.put(2, "Asif");
		empMap.put(11, "Auntor");
		empMap.put(52, "Asif");
		empMap.put(100, "Auntor");
		empMap.put(263, "Asif");
		return empMap;
	}
	
	private void printMap(Map<Integer,String> mapToPrint) {
		System.out.println(mapToPrint);
	}
}
