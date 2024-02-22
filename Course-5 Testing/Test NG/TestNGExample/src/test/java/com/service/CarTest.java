package com.service;

import org.testng.annotations.Test;

public class CarTest {
	@Test(groups = {"speed"})
	  public void speedTest() {
		  System.out.println("Car Test speed function");
	  }
	  
	  @Test(groups = {"speed"})
	  public void mileageTest() {
		  System.out.println("Car Test mileage function");
	  }
	  
	  @Test
	  public void colorTest() {
		  System.out.println("Car Test color function");
	  }
}
