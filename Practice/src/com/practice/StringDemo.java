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
		
	// s1.append()   -> This is not possible
		
		StringBuffer str = new StringBuffer("Welcome To");
		str.append(" Acharjee Home");
		System.out.println(str);
		str.insert(0,"Hi, ");
		System.out.println(str);
		
		//replace 
		
		StringBuffer str1 = new StringBuffer("Welcome");
		str1.replace(0,2,"8");
		System.out.println(str1);
		
		// delete
		StringBuffer str2 = new StringBuffer("Welcome");
		str2.delete(0,3);
		System.out.println(str2);
		
		// reverse
		StringBuffer str3 = new StringBuffer("Welcome");
		System.out.println(str3.reverse());
		
//		StringBuffer can be accessed by multiple threads at a time and slow then StringBuilder
//		StringBuilder can be accessed by single thread at a time and faster then stringBuffer
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
