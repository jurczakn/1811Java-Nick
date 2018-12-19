package com.lurkon.books.repos;

import org.springframework.data.repository.CrudRepository;

import com.lurkon.books.beans.Author;

public interface AuthorDao extends CrudRepository<Author, Integer>{

}
