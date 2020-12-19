package com.inputOutputDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStreamDemo demo = new FileInputStreamDemo();
		demo.readFromFile("C:\\PracticeIO\\empInfo.txt");
	}
	
	
	private void readFromFile(String fileToRead) throws IOException {
		FileInputStream inputStream = new FileInputStream(fileToRead);
		int intRead;
		while((intRead=inputStream.read())!=-1) {
			System.out.println((char)intRead);
		}
		inputStream.close();
		
	}
	
	
	

}
