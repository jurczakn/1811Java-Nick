package com.lurkon.books.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lurkon.books.beans.Author;
import com.lurkon.books.services.AuthorService;

@RestController
@RequestMapping(value="/authors")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthorController {
	@Autowired
	private AuthorService as;
	
	@RequestMapping(method=RequestMethod.GET)
	public Set<Author> getAuthors() {
		return as.getAuthors();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Author addBook(@RequestBody Author a) {
		return as.addAuthor(a);
	}
	
	@RequestMapping(value="{authorId}", method=RequestMethod.GET)
	public Author getAuthor(@PathVariable("authorId") int id) {
		return as.getAuthor(id);
	}
	
	@RequestMapping(value="{authorId}", method=RequestMethod.PUT)
	public Author updateAuthor(@PathVariable("authorId") int id, @RequestBody Author a) {
		return as.updateAuthor(a);
	}
	
	@RequestMapping(value="{authorId}", method=RequestMethod.DELETE)
	public void deleteAuthor(@PathVariable("authorId") int id, @RequestBody Author a) {
		as.deleteAuthor(a);
	}
	
	public AuthorService getAs() {
		return as;
	}
	public void setAs(AuthorService as) {
		this.as = as;
	}
}
