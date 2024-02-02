package com;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileAppend {
	
	public static void main(String[] args) {
		File myFile=new File("New_file1.txt");
		try(FileWriter fw=new FileWriter("New_file1.txt",true);
		BufferedWriter bw= new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bw);)
		{
		pw.println("Java-Full Stack Development!!"); //appending to existing file content
		pw.println("Enjoy your Learning!!!");
		}catch(IOException e){
		e.printStackTrace();
		}
	}
}
