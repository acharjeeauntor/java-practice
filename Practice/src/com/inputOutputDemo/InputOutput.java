package com.inputOutputDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File empInfoFile = new File("C:\\PracticeIO\\empInfo.txt");
		InputOutput io = new InputOutput();
		io.WriteToFile(empInfoFile);
		io.readTheFile(empInfoFile);
 
	}
	
	
	
	public void WriteToFile(File fileWrite) {
		PrintWriter empInfoWrite = null;
		try {
		 empInfoWrite = new PrintWriter(fileWrite);
			empInfoWrite.println("Auntor Acharja");
			empInfoWrite.println("172-15-10047");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found");
			e.printStackTrace();
		}finally {
			empInfoWrite.close();
		}
	}
	
	public void readTheFile(File fileRead) throws FileNotFoundException {
		Scanner readFile = new Scanner(fileRead);
		while(readFile.hasNext()) {
			System.out.println("From File We Get: "+readFile.nextLine());
		}
		
		
	}
	
	

}
