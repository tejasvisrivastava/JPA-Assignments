package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.entities.Author;
import com.capg.entities.Book;

public class TestApp {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Assignment2");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Author auth=new Author(101, "Dk");
		Author auth1=new Author(102,"Dr. Naryan");
		Book b=new Book(103,"Martin",123,"C",2500);
		entityManager.getTransaction().begin();
		entityManager.persist(auth);
		entityManager.persist(auth1);
		entityManager.persist(b);
		entityManager.getTransaction().commit();
		System.out.println("Data Saved");
		entityManagerFactory.close();
		
	}

}
