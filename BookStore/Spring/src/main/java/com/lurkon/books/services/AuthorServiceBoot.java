package com.lurkon.books.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lurkon.books.beans.Author;
import com.lurkon.books.repos.AuthorDao;

@Service
public class AuthorServiceBoot implements AuthorService{
	@Autowired
	private AuthorDao ad;

	@Override
	public Set<Author> getAuthors() {
		Set<Author> authors = new HashSet<>();
		Iterable<Author> iterable = ad.findAll();
		iterable.forEach(authors::add);
		return authors;
	}
	@Override
	public Author getAuthor(int id) {
		return ad.findOne(id);
	}
	@Override
	public Author addAuthor(Author a) {
		return ad.save(a);
	}
	
	@Override
	public Author updateAuthor(Author a) {
		return ad.save(a);
	}
	
	@Override
	public void deleteAuthor(Author a) {
		ad.delete(a);
	}
	
	public AuthorDao getAd() {
		return ad;
	}

	public void setAd(AuthorDao ad) {
		this.ad = ad;
	}
}
