package com.healthcare.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.healthcare.entity.Patient;
import com.healthcare.resource.SessionFactoryResource;

public class PatientDao {

	public int storePatient(Patient patient) {
		try {
			SessionFactory sf = SessionFactoryResource.getSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(patient);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public List<Patient> findAllPatient(){
		SessionFactory sf=SessionFactoryResource.getSessionFactory();
		Session session =sf.openSession();
		TypedQuery tq= session.createQuery("from Patient");
		List<Patient> listOfPatient = tq.getResultList();
		return listOfPatient;
	}
}
