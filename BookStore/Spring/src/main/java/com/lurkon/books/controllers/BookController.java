package com.lurkon.books.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lurkon.books.beans.Book;
import com.lurkon.books.services.BookService;

@RestController
@RequestMapping(value="/books")
@CrossOrigin(origins = "http://localhost:4200")
public class BookController{
	@Autowired
	private BookService bs;

	@RequestMapping(method=RequestMethod.GET)
	public Set<Book> getBooks() {
		return bs.getBooks();
	}
	@RequestMapping(method=RequestMethod.POST)
	public Book addBook(@RequestBody Book b) {
		return bs.addBook(b);
	}
	@RequestMapping(value="{bookId}", method=RequestMethod.GET)
	public Book getBook(@PathVariable("bookId") int id) {
		return bs.getBookById(id);
	}
	@RequestMapping(value="{bookId}", method=RequestMethod.PUT)
	public Book updateBook(@PathVariable("bookId") int id, @RequestBody Book b) {
		// ToDo: Error Handling
		bs.updateBook(b);
		return bs.getBookById(id);
	}
	@RequestMapping(value="{bookId}", method=RequestMethod.DELETE)
	public void deleteBook(@PathVariable("bookId") int id) {
		bs.deleteBook(bs.getBookById(id));
	}
	
	public BookService getBs() {
		return bs;
	}

	public void setBs(BookService bs) {
		this.bs = bs;
	}
}
