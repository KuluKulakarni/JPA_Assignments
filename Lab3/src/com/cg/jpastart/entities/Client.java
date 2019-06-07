package com.cg.jpastart.entities;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();

		// first define few products before we place order

		Book fictionBook = new Book();
		fictionBook.setISBN(000);
		fictionBook.setTitle("FICTION");
		fictionBook.setPrice(450);

		Book ComicBook = new Book();
		ComicBook.setISBN(005);
		ComicBook.setTitle("COMIC");
		ComicBook.setPrice(450);

		Book Detective  = new Book();
		Detective .setISBN(006);
		Detective .setTitle("DETECTIVE ");
		Detective .setPrice(1500);

		Book Fantasy = new Book();
		Fantasy.setISBN(007);
		Fantasy.setTitle("FANTASY");
		Fantasy.setPrice(1500);

		// now define first order and add few products in it
		Author firstBook = new Author();
		firstBook.setId(2000);
		firstBook.setName("Fiction");
		
		firstBook.addBook(ComicBook);
		firstBook.addBook(fictionBook);
		firstBook.addBook(Fantasy);

		// now define second order and add few products in it
		Author secondBook = new Author();
		secondBook.setId(2001);
		secondBook.setName("Fantasy");

		secondBook.addBook(Detective);
		secondBook.addBook(fictionBook);
		secondBook.addBook(ComicBook);
		// save orders using entity manager

		em.persist(firstBook);
		em.persist(secondBook);
		
		System.out.println("Added orders along with order details to database.");

		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
