package com.practice;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "Auntor";
		String s2 = "auntor";
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.substring(2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.replace('n', 'p'));
		System.out.println(s1.contains("o"));
		System.out.println(s1.equals(s2));
		System.out.println(s2.endsWith("r"));
	}

}
