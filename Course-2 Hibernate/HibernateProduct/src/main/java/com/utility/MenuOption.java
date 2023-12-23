package com.utility;

import java.util.List;
import java.util.Scanner;

import com.entity.AddProduct;
import com.service.AddProductService;

public class MenuOption {

	public static void productMenuOption() {
		
		Scanner sc=new Scanner(System.in);
		int choice;
		String con="";
		int id;
		String name;
		float price;
		String result;
		AddProductService pp = new AddProductService();
		
		do {
			System.out.println("Product Menu");
			System.out.println("1:Add 2: Retrive All Products");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter product id");
		      id = sc.nextInt();
		      System.out.println("Enter product name");
		      name= sc.next();
		      System.out.println("Enter product price");
		      price = sc.nextFloat();
		      
		      AddProduct p1 = new AddProduct(id, name, price);
		      result = pp.storeProduct(p1);
		      System.out.println(result);
					break;
			case 2:List<AddProduct> listOfProduct = pp.findAllProducts();
		 		for(AddProduct p:listOfProduct) {
		 			System.out.println(p);  // all student details 
		 		}
		 		break;
			default:
				break;
		}
		System.out.println("Do you want to continue?(y/n)");
		con = sc.next();
	}while(con.equals("y"));
	
	}
}
