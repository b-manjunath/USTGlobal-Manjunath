package com.ustglobal.productdetails;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.productdetails.dto.ProductDetails;

public class InsertDemo {

	public static void main(String[] args) {
		ProductDetails productDetails =new ProductDetails();
		productDetails.setId(5);
		productDetails.setName("Pen");
		productDetails.setPrice(100);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(productDetails);
		System.out.println("Record saved");
		entityManager.close();

	}// end of main method
}// end of class
