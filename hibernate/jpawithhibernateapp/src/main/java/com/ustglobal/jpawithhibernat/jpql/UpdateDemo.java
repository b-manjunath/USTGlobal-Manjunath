package com.ustglobal.jpawithhibernat.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = " update ProductInfo set pname='Watch' where pid=2";
			Query query =entityManager.createQuery(jpql);
			int result = query.executeUpdate();
			System.out.println(result);
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		entityManager.close();
	}

}
