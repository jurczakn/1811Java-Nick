package com.lurkon.books.services;

import java.util.Set;

import com.lurkon.books.beans.Author;

public interface AuthorService {

	Set<Author> getAuthors();

	Author addAuthor(Author a);

	Author updateAuthor(Author a);

	void deleteAuthor(Author a);

	Author getAuthor(int id);

}
