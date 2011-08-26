package org.primefaces.examples.moviecollector.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.examples.moviecollector.domain.Movie;
import org.primefaces.examples.moviecollector.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("viewMovie")
@Scope("request")
public class ViewMovie implements Serializable{

	private Movie movie;
	
	private MovieService movieService;
	
	public ViewMovie() {}
	
	@Autowired
	public ViewMovie(MovieService movieService) {
		this.movieService = movieService;
	}
	
	@PostConstruct
	public void onLoad() {
		String movieId = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("movieId");
		movie = movieService.findById(Long.valueOf(movieId));
	}
	
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	public String update() {
		movieService.update(movie);
		FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Movie is updated successfully", "OK");
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);
		
		return null;
	}
	
	public String remove() {
		movieService.remove(movie);
		
		return "listMovies";
	}
}
