package com.lurkon.books.services;

import java.util.Set;

import com.lurkon.books.beans.Book;
import com.lurkon.books.beans.Customer;

public interface BookService {
	public Set<Book> getBooksForReadingList(Customer cust);
	public Book getBookById(int i);
	
	public void updateBook(Book b);
	public void deleteBook(Book b);
	public Book addBook(Book b);
	public Set<Book> getBooks();
}
