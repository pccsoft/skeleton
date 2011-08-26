package org.primefaces.examples.moviecollector.service;

import java.util.List;

import org.primefaces.examples.moviecollector.domain.Movie;

public interface MovieService {

	public void createNew(Movie movie);
	
	public List<Movie> findAll();
	
	public List<Movie> findByTitle(String title);
	
	public void update(Movie movie);
	
	public void remove(Movie movie);
	
	public Movie findById(Long id);
}
