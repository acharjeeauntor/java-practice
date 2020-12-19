package com.inputOutputDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File bikeInfoFile = new File("C:\\PracticeIO\\bikeInfo.txt");
		FileWriterDemo filewriterdemo = new FileWriterDemo();
		filewriterdemo.writeToFile(bikeInfoFile);
		filewriterdemo.readToFile(bikeInfoFile);
	}
	
	
	private void writeToFile(File fileToWrite) throws IOException {
		FileWriter bikeInfo = new FileWriter(fileToWrite);
		bikeInfo.write("Auntor");
		bikeInfo.flush();
		bikeInfo.close();
	}
	
	
	private void readToFile(File fileToWrite) throws IOException {
		Scanner bikeInfo = new Scanner(fileToWrite);
		while(bikeInfo.hasNext()) {
			System.out.println("outPut is : "+bikeInfo.nextLine());
		}
		bikeInfo.close();
	}
	
	

}