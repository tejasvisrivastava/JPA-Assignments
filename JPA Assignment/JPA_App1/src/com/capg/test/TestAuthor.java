package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.entities.Author;

public class TestAuthor {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Author");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Author auth=new Author(102,"Alok","yadav","Dixit",895315542);
		Author auth1=entityManager.find(Author.class, 101);
		Author auth2=entityManager.find(Author.class, 102);
		auth1.setFirstName("Vijay");
		EntityTransaction  entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(auth);
		entityManager.persist(auth1);
		entityTransaction.commit();
		if(auth2!=null)
		{
			entityManager.getTransaction().begin();
			entityManager.remove(auth2);
			entityManager.getTransaction().commit();
		}
		else
		{
			System.out.println("Id is not Available");
		}
		System.out.println("object is saved in database");
		entityManager.close();
		
	}

}
