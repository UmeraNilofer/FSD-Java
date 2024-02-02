package com.service;

import java.util.List;

import com.dao.AddProductDao;
import com.entity.AddProduct;

public class AddProductService {

AddProductDao pd = new AddProductDao();
	
	public String storeProduct(AddProduct addproduct) {
		if(pd.storeProduct(addproduct)>0) {
			return "Product record stored successfully";
		}else {
			return "Record didn't store";
		}
	}
	
	public List<AddProduct> findAllProducts() {
		return pd.findAllProducts();
	}
}
