package com;

class MyException extends Exception{
	String str1;
	MyException(String str2){
		str1=str2;
	}
	public String toString() {
		return("MyException Occured: "+str1);
	}
}
public class ProjectPractice6 {

	public static void main(String[] args) {
		try {
			System.out.println("Starting of try block");
			
			throw new MyException ("This is My error Message");		//throwing the custom exception using "throw"
		}catch(MyException e) {
			System.out.println("Catch Block");
			System.out.println(e);
		}
	}
}
