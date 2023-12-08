package com.camerarental.bean;
import java.util.concurrent.atomic.AtomicInteger;

public class CameraDetails {
	private int id;
	private String brand;
	private String model;
	private float price;
	private String status;
	
	private static AtomicInteger count = new AtomicInteger(0);
	
	public float total;

	public CameraDetails() {
		super();
		
	}

	public CameraDetails(int id, String brand, String model, float price, String status) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.status = status;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getId() {
		return id+1;
	}

	public void setId(int id) {
		this.id =id;

	}
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		if(status==true) {
			this.status = "Available" ;
		} else {
			this.status = "Rented";
		}
	}
	
	@Override
	public String toString() {
		return "id=" + id+1 + " brand=" + brand + " model=" + model + " price=" + price + " status="
				+ status ;
	}
	
	
}
