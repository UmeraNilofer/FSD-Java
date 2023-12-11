package com;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {

	public static void main(String[] args) {
		
		File myFile=new File("New_file1.txt");
		try {
		FileWriter fileWriter=new FileWriter("New_file1.txt");
		fileWriter.write("Welcome to Simplilearn!");
		fileWriter.close();
		System.out.println("Writing to File, Successfully...");
		}catch(Exception e) {
		e.printStackTrace();
		}

	}

}
