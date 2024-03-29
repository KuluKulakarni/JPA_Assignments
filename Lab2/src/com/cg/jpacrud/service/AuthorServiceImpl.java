package com.cg.jpacrud.service;

import com.cg.jpacrud.dao.AuthorDao;
import com.cg.jpacrud.dao.AuthorDaoImpl;
import com.cg.jpacrud.entities.Author;


public class AuthorServiceImpl implements AuthorService {

	private AuthorDao dao;

	public AuthorServiceImpl() {
		dao = new AuthorDaoImpl();
	}

	@Override
	public void addAuthor(Author author) {
		dao.beginTransaction();
		dao.addAuthor(author);
		dao.commitTransaction();
	}
	
	@Override
	public void updateAuthor(Author author) {
		dao.beginTransaction();
		dao.updateAuthor(author);
		dao.commitTransaction();
	}
	
	@Override
	public void removeAuthor(Author author) {
		dao.beginTransaction();
		dao.removeAuthor(author);
		dao.commitTransaction();
	}

		@Override
		public Author findAuthorById(int id) {
			// TODO Auto-generated method stub
			Author author  = dao.getAuthorById(id);
			return author;
			 
		}

	
	



}
