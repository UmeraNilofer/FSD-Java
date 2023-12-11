package com;
import java.io.File;
import java.io.FileWriter;

public class CreateFile {

	public static void main(String[] args) {
		
		File myFile=new File("New_file1.txt");
		try {
		myFile.createNewFile();
		System.out.println("New File created Successfully...");
		}catch(Exception e) {
		e.printStackTrace();
		}

	}

}
