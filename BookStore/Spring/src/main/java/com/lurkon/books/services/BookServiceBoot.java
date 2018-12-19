package com.lurkon.books.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lurkon.books.beans.Book;
import com.lurkon.books.beans.Customer;
import com.lurkon.books.repos.BookDao;

@Service
public class BookServiceBoot implements BookService {
	@Autowired
	private BookDao bd;
	
	@Override
	public Set<Book> getBooksForReadingList(Customer cust) {
		return cust.getReadingList();
	}

	@Override
	public Book getBookById(int i) {
		return bd.findOne(i);
	}

	@Override
	public void updateBook(Book b) {
		bd.save(b);
	}

	@Override
	public void deleteBook(Book b) {
		bd.delete(b);
	}

	@Override
	public Book addBook(Book b) {
		Book book = bd.save(b);
		return book;
	}
	@Override
	public Set<Book> getBooks() {
		Set<Book> books = new HashSet<>();
		Iterable<Book> iterable = bd.findAll();
		iterable.forEach(books::add);
		return books;
	}

	// setters and getters for autowiring
	public BookDao getBd() {
		return bd;
	}

	public void setBd(BookDao bd) {
		this.bd = bd;
	}
	
}
