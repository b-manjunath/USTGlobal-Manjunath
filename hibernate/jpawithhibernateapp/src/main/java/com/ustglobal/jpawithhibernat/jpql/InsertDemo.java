package com.ustglobal.jpawithhibernat.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertDemo {
	public static void main(String[] args) {

		EntityManager entityManager = null;
		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();

			String jpql = "insert into ProductInfo values(4,book,500);";
			
			Query query = entityManager.createQuery(jpql);
			query.getResultList();
			List<String> productInfos = query.getResultList();

			for(String string : productInfos) {
				System.out.println(string);
			}


		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}