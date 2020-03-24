package com.curso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.curso.model.Libro;
import com.curso.model.Tema;

@Repository
public class LibroDaoImp implements LibroDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public List<Libro> readAllBooks() {
		TypedQuery<Libro> query = em.createNamedQuery("Libro.findAll", Libro.class);
		return query.getResultList();
	}

	@Override
	public List<Tema> readAllTopics() {
		TypedQuery<Tema> query = em.createNamedQuery("Tema.findAll", Tema.class);
		return query.getResultList();
	}
	
	@Override
	public List<Libro> readBooksByTopic(int topic) {
		String jpql="Select l From Libro l where l.idTema=?1";
		TypedQuery<Libro> query=em.createQuery(jpql,Libro.class);
		query.setParameter(1, topic);
		return query.getResultList();
	}

}
