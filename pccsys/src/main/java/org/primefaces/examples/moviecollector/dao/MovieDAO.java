package org.primefaces.examples.moviecollector.dao;

import java.util.List;

import org.primefaces.examples.moviecollector.domain.Movie;

public interface MovieDAO {

	Movie loadById(Long id);
	
	void persist(Movie movie);
	
	void update(Movie movie);
	
	void delete(Movie movie);
	
	List<Movie> loadAll();
	
	public List<Movie> findByTitle(String title);
}
