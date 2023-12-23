package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employees {
	@Id
	private int eid;
	private String ename;
	private float salary;
	private Integer pid;
	@OneToOne
	@JoinColumn(name = "eid")				//to link in address table for FK
	private Address address;
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int eid, String ename, float salary, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Employees [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", pid=" + pid + ", address="
				+ address + "]";
	}
	
}
