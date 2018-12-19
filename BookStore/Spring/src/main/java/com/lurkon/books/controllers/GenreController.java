package com.lurkon.books.controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lurkon.books.beans.Genre;
import com.lurkon.books.repos.GenreDao;

@RestController
@RequestMapping(value="/genres")
@CrossOrigin(origins = "http://localhost:4200")
public class GenreController {
	@Autowired
	private GenreDao gd;
	
	@RequestMapping(method=RequestMethod.GET)
	public Set<Genre> getGenres() {
		Set<Genre> genres = new HashSet<Genre>();
		gd.findAll().forEach(genres::add);
		return genres;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Genre addGenre(@RequestBody Genre g) {
		return gd.save(g);
	}

	@RequestMapping(value="{genreId}", method=RequestMethod.GET)
	public Genre getGenre(@PathVariable("genreId") int id) {
		return gd.findOne(id);
	}
	
	@RequestMapping(value="{genreId}", method=RequestMethod.POST)
	public Genre updateGenre(@PathVariable("genreId") int id, @RequestBody Genre g) {
		return gd.save(g);
	}
	@RequestMapping(value="{genreId}", method=RequestMethod.DELETE)
	public void deleteGenre(@PathVariable("genreId") int id, @RequestBody Genre g) {
		gd.delete(g);
	}
	
	public GenreDao getGd() {
		return gd;
	}

	public void setGd(GenreDao gd) {
		this.gd = gd;
	}
}
