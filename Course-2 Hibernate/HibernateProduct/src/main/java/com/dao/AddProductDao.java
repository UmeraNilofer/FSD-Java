package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.AddProduct;
import com.resource.HibernateResource;

public class AddProductDao {

	public int storeProduct(AddProduct addproduct) {
		try {
			SessionFactory sf = HibernateResource.getSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
				session.save(addproduct);
			tran.commit();
			return 1;
		}catch(Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public List<AddProduct> findAllProducts() {
		SessionFactory sf = HibernateResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("from AddProduct");
		List<AddProduct> listOfProducts= tq.getResultList();
		return listOfProducts;
	}
}
