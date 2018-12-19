package com.lurkon.books.repos;

import org.springframework.data.repository.CrudRepository;

import com.lurkon.books.beans.Genre;

public interface GenreDao extends CrudRepository<Genre, Integer> {

}
