package org.primefaces.examples.moviecollector.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.primefaces.examples.moviecollector.domain.Movie;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDAOWithJPA implements MovieDAO {

	@PersistenceContext
	protected EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Movie> findByTitle(String title) {
		Query query = entityManager.createQuery("Select m from Movie m where m.title LIKE :title");
		query.setParameter("title", title + "%");

		return query.getResultList();
	}

	public Movie loadById(Long id) {
		return entityManager.find(Movie.class, id);
	}

	public void persist(Movie movie) {
		entityManager.persist(movie);
	}

	public void update(Movie movie) {
		entityManager.merge(movie);
	}

	public void delete(Movie movie) {
		//entityManager.remove(entityManager.merge(movie));
		//entityManager.remove(movie);
		entityManager.createQuery("DELETE FROM Movie m WHERE m.id=:id").setParameter("id", movie.getId()).executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Movie> loadAll() {
		return entityManager.createQuery("Select m from Movie m").getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}