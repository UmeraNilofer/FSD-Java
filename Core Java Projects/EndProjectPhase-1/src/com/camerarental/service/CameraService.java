package com.camerarental.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.camerarental.bean.CameraDetails;

public class CameraService {
	
	List<CameraDetails> listOfCamera= new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	CameraDetails cd=new CameraDetails();
	
	//Add a camera
	public void addCamera() {
		int id=0;
		System.out.print("ENTER THE CAMERA BRAND -");
		String brand=sc.next();
		System.out.print("ENTER THE MODEL -");
		String model=sc.next();
		System.out.print("ENTER THE PER DAY PRICE (INR) -");
		float price=sc.nextFloat();
		
		cd.setBrand(brand);
		cd.setModel(model);
		cd.setPrice(price);
			listOfCamera.add(cd);
		System.out.println("YOUR CAMERA HAS BEEN SUCCESSFULLY ADDED TO THE LIST");
	}
	
	//remove a camera
	public void removeCamera() {
		
		System.out.println("ENTER THE CAMERA ID TO REMOVE -"+cd.getId());
		Iterator<CameraDetails> li= listOfCamera.iterator();
		while(li.hasNext()) {
			CameraDetails cd= li.next();
			li.remove();
		}
		System.out.println("CAMERA SUCCESSFULLY REMOVED FROM THE LIST");
	}
	
	//View the list of camera added by me
	public void viewMyCamera() {
	
		Iterator<CameraDetails> li= listOfCamera.iterator();
		while(li.hasNext()) {
			CameraDetails cd= li.next();
			System.out.println(cd);
		}
	}
	
	//Rent a camera
	public void rentACamera() {
		
		System.out.println("FOLLOWING IS THE LIST OF AVAILABLE CAMERA(S) -");
		Iterator<CameraDetails> li= listOfCamera.iterator();
		while(li.hasNext()) {
			CameraDetails cd= li.next();
			System.out.print(cd);
		}
		System.out.print("ENTER THE CAMERA ID YOU WANT TO RENT -");
		cd.getId();
		if(cd.total >= cd.getPrice()) {
			System.out.println("YOUR TRANSACTION FOR CAMERA - "+cd.getBrand()+" "+cd.getModel()+" with rent INR."+cd.getPrice()+" HAS SUCCESSFULLY COMPLETED.");
		}else {
			System.out.println("ERROR: TRANSACTION FAILED DUE TO INSUFFICIENT WALLET BALANCE. PLEASE DEPOSIT THE AMOUNT TO YOUR WALLET.");
		}
	}
	
	//View all the cameras in the list
	public void viewAllCameras() {
		
		Iterator<CameraDetails> li= listOfCamera.iterator();
		while(li.hasNext()) {
			CameraDetails cd= li.next();
			System.out.print(cd);
		}
	}
	
	//Total Amount in my wallet
	public void myWallet() {
		
		float currentbal=0,deposit=0;
		cd.total=currentbal+deposit;
		System.out.println("YOUR CURRENT WALLET BALANCE IS - INR."+currentbal);
		String confirm="";
		do {
			System.out.println("DO YOU WANT TO DEPOSIT MORE AMOUNT TO YOUR WALLET?(1.YES 2.NO)");
			confirm=sc.next();
		}while(confirm.equalsIgnoreCase("1"));
		System.out.println("ENTER THE AMOUNT (INR) - ");
		System.out.println("YOUR WALLET BALANCE UPDATED SUCCESSFULLY. CURRENT WALLET BALANCE - INR."+cd.total);
	}
	
}
