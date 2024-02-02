package com.healthcare.service;

import java.util.List;

import com.healthcare.dao.PatientDao;
import com.healthcare.entity.Patient;

public class PatientService {

	PatientDao pd=new PatientDao();
	
	public String storePatient(Patient patient) {
		
	    if(pd.storePatient(patient)>0) {
			return "Patient details stored successfully";
		}else {
			return "Patient details didn't store";
		}
		
	}
	
	public List<Patient> findAllPatient(){
		//here we can use condition also
		return pd.findAllPatient();				
	}
}
