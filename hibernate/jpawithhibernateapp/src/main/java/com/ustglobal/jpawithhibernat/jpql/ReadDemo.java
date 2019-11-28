package com.ustglobal.jpawithhibernat.jpql;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class ReadDemo {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		//String jpql = "from ProductInfo";
		String jpql = "select pname from ProductInfo";

		Query query = entityManager.createQuery(jpql);
		query.getResultList();
		//List<ProductInfo> productInfos = query.getResultList();
		List<String> productInfos = query.getResultList();
		
		for(String string : productInfos) {
			//System.out.println(productInfo.getPid());
			System.out.println(string);
			//System.out.println(productInfo.getQuantity());
		}

	}
}
