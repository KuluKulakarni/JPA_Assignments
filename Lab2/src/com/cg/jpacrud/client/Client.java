package com.cg.jpacrud.client;

import com.cg.jpacrud.entities.Author;

import com.cg.jpacrud.service.AuthorService;
import com.cg.jpacrud.service.AuthorServiceImpl;


public class Client {

	public static void main(String[] args) {

		//Debug this program as Debug -> Debug as Java Application
		
		AuthorService service = new AuthorServiceImpl();
		
		Author author = new Author();
		author.setAuthorId(201);
		author.setFirstname("Kulu");
		author.setMiddlename("Manali");
		author.setLastname("V");
		author.setPhoneNo(245755);
		service.addAuthor(author);
		
		//at this breakpoint, we have added one record to table
		author = service.findAuthorById(201);
		System.out.print("ID:"+author.getAuthorId());
		System.out.println(" Name:"+author.getFirstname());
		System.out.println(" Name:"+author.getMiddlename());
		System.out.println(" Name:"+author.getLastname());
		System.out.println(" Phoneno:"+author.getPhoneNo());
		
		author.setFirstname("Sujan ");
		service.updateAuthor(author);
		
		//at this breakpoint, we have updated record added in first section
		author = service.findAuthorById(201);
		System.out.print("ID:"+author.getAuthorId());
		System.out.println(" fName:"+author.getFirstname());
		System.out.println(" mName:"+author.getMiddlename());
		System.out.println(" lName:"+author.getLastname());
		System.out.println(" Phoneno:"+author.getPhoneNo());
		
		//at this breakpoint, record is removed from table
		service.removeAuthor(author);
		System.out.println("End of program...");
		
		
		

	}
}
