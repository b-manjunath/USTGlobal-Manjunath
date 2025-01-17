package com.ustglobal.jpawithhibernat.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestManyToOne {
	public static void main(String[] args) {

		PencilBox pBox = new PencilBox();
		pBox.setBid(1);
		pBox.setBname("Apsara");

		Pencil pencil = new Pencil();
		pencil.setPid(10);
		pencil.setColor("black");
		pencil.setPencilBox(pBox);

		Pencil pencil1 = new Pencil();
		pencil1.setPid(20);
		pencil.setColor("green");
		pencil.setPencilBox(pBox);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction =entityManager.getTransaction();
			entityTransaction.begin();
			
			entityManager.persist(pencil);
			entityManager.persist(pencil1);

			System.out.println("Record saved");
			entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}finally {
			entityManager.close();
		}


	}
}