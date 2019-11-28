package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.ProductInfo;

public class ReadDemo {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		System.out.println("record presented");
		ProductInfo productDetail = entityManager.find(ProductInfo.class, 1);
		System.out.println("Id is :"+productDetail.getPid());
		System.out.println("Name is :"+productDetail.getPname());
		System.out.println("Quality is:"+productDetail.getQuantity());


	}// end of main method
}// end of class
