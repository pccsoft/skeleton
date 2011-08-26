package org.primefaces.examples.moviecollector.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

import org.primefaces.examples.moviecollector.domain.Movie;
import org.primefaces.examples.moviecollector.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("manageMovies")
@Scope("session")
public class ManageMovies implements Serializable{

	private List<Movie> movies;
	
	private MovieService movieService;
	
	private String title;
	
	private Movie movie;

	public ManageMovies() {}

	@Autowired
	public ManageMovies(MovieService movieService) {
		this.movieService = movieService;
	}

	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public List<String> getMoviesByTitle(String title) {
		List<Movie> foundMovies = movieService.findByTitle(title);
		List<String> titles = new ArrayList<String>();
	
		for(Movie m : foundMovies)
			titles.add(m.getTitle());
		
		return titles;
	}
		
	public void search(ActionEvent actionEvent) {
		movies = movieService.findByTitle(title);
	}
}