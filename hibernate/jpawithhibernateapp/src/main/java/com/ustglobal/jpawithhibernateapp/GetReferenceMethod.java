package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class GetReferenceMethod {
	public static void main(String[] args) {
		EntityTransaction transaction = null;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			ProductInfo productInfo = entityManager.getReference(ProductInfo.class,1);
			
			//ProductInfo productInfo = entityManager.find(ProductInfo.class,1);
			
//			System.out.println(productInfo.getPname());
//			System.out.println(productInfo.getQuantity());
//			entityManager.close();
//
		}catch(Exception e){
			e.printStackTrace();	
		}
	}

}
