package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			ProductInfo productInfo =entityManager.find(ProductInfo.class, 10);
			productInfo.setPname("Mobile");
			productInfo.setQuantity(20);
			System.out.println("Update Recorded");
			entityTransaction.commit();
		}catch(Exception e){
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();

	}
}
