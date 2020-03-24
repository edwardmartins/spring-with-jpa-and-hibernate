package com.curso.dao;

import java.util.List;

import com.curso.model.Libro;
import com.curso.model.Tema;

public interface LibroDao {
	List<Libro> readAllBooks();
	List<Tema> readAllTopics();
	List<Libro> readBooksByTopic(int topic);
}
