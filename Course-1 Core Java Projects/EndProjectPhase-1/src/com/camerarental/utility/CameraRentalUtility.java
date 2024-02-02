package com.camerarental.utility;
import java.util.Scanner;
import com.camerarental.service.*;

public class CameraRentalUtility {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void login() {
		System.out.println("PLEASE LOGIN TO CONTINUE -");
		System.out.print("USERNAME -");
		String username=sc.next();
		System.out.print("PASSWORD -");
		String password=sc.next();
		
		if(username.equals(username) && password.equals(password)) {
			System.out.println("Login Successful...");
			mainOption();
		}else {
			System.out.println("Login failed! Try once again...");
		}
	}
	
	private static void mainOption() {
		int choice;
		String confirm="";
		CameraService cs=new CameraService();
		do {
			System.out.println("1. MY CAMERA");
			System.out.println("2. RENT A CAMERA");
			System.out.println("3. VIEW ALL CAMERAS");
			System.out.println("4. MY WALLET");
			System.out.println("5. EXIT");
			choice=sc.nextInt();
			switch(choice) {
			case 1: 
					subOption1();
					break;
			case 2: 
					cs.rentACamera();
					break;
			case 3: 
					cs.viewAllCameras();
					break;
			case 4: 
					cs.myWallet();
					break;
			case 5: 
					break;
			default: 
					System.out.println("Wrong choice");
					break;
			} 
			System.out.println("Do you want to continue(Y/N)");
			confirm=sc.next();
		}while(confirm.equalsIgnoreCase("Y"));
	}
	
	private static void subOption1() {
		int choice;
		String confirm="";
		CameraService cs=new CameraService();
		do {
			System.out.println("1. ADD");
			System.out.println("2. REMOVE");
			System.out.println("3. VIEW MY CAMERAS");
			System.out.println("4. GO TO PREVIOUS MENU");
			choice=sc.nextInt();
			switch(choice) {
			case 1: 
					cs.addCamera();
					break;
			case 2: 
					cs.removeCamera();
					break;
			case 3: 
					cs.viewMyCamera();
					break;
			case 4: 
					mainOption();
					break;
			default: 
					System.out.println("Wrong choice");
					break;
			} 
			System.out.println("Do you want to continue(Y/N)");
			confirm=sc.next();
		}while(confirm.equalsIgnoreCase("Y"));
	}
}
