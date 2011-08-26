package org.primefaces.examples.moviecollector.service;

import java.util.List;

import org.primefaces.examples.moviecollector.dao.MovieDAO;
import org.primefaces.examples.moviecollector.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("movieService")
public class MovieServiceImpl implements MovieService{

	private MovieDAO movieDAO;
	
	@Autowired
	public MovieServiceImpl(MovieDAO movieDAO) {
		this.movieDAO = movieDAO;
	}
	
	@Transactional
	public void createNew(Movie movie) {
		movieDAO.persist(movie);
	}

	@Transactional(readOnly=true)
	public List<Movie> findAll() {
		return movieDAO.loadAll();
	}

	@Transactional(readOnly=true)
	public List<Movie> findByTitle(String title) {
		return movieDAO.findByTitle(title);
	}

	@Transactional
	public void update(Movie movie) {
		movieDAO.update(movie);
	}
	
	@Transactional
	public void remove(Movie movie) {
		movieDAO.delete(movie);
	}

	@Transactional(readOnly=true)
	public Movie findById(Long id) {
		return movieDAO.loadById(id);
	}
}