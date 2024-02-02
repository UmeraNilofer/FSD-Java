package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Feedback {

	@Id
	private int id;
	private String name;
	private String fb;
	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(int id, String name, String fb) {
		super();
		this.id = id;
		this.name = name;
		this.fb = fb;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFb() {
		return fb;
	}

	public void setFb(String fb) {
		this.fb = fb;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", name=" + name + ", fb=" + fb + "]";
	}
	
}
