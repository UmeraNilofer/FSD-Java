package com.healthcare.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	private int pid;
	private String name;
	private String pemail;
	private String phone;
	private String age;
	private String diagnosis;
	private String remark;
	private String gender;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int pid,String name, String pemail, String phone, String age, String diagnosis, String remark,String gender) {
		super();
		this.pid= pid;
		this.name = name;
		this.pemail = pemail;
		this.phone = phone;
		this.age = age;
		this.diagnosis = diagnosis;
		this.remark = remark;
		this.gender= gender;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
