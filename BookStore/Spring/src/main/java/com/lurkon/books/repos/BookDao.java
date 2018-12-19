package com.lurkon.books.repos;

import org.springframework.data.repository.CrudRepository;

import com.lurkon.books.beans.Book;

public interface BookDao extends CrudRepository<Book, Integer>{

}
