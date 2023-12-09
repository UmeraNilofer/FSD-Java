package com.camerarental.bean;

public class CameraDetails {
	private int id;
	private String brand;
	private String model;
	private float price;
	private String status;
	
	private static int next_id=0;
	private float total=0;

	public CameraDetails() {
		super();
		
	}

	public CameraDetails(String brand, String model, float price, String status) {
		super();
		this.id = next_id;    
		next_id++;
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
		return id;
	}

	public void setId(int id) {
		this.id =id;
	}
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(boolean isRented) {
		if (isRented) {
            status = "Rented";
        } else {
            status = "Available";
        }
	}
	
	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "id=" + this.id + " brand=" + brand + " model=" + model + " price=" + price + " status="
				+ status ;
	}
	
	
}
