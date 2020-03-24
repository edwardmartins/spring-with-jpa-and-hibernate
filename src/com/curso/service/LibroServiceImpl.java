package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.LibroDao;
import com.curso.model.Libro;
import com.curso.model.Tema;

@Service
public class LibroServiceImpl implements LibroService {
	
	@Autowired
	LibroDao dao;

	@Override
	public List<Libro> recuperarLibros() {
		return dao.readAllBooks();
	}

	@Override
	public List<Tema> recuperarTemas() {
		return dao.readAllTopics();
	}

	@Override
	public List<Libro> recuperarLibrosPorTema(int topic) {
		return dao.readBooksByTopic(topic);
	}

}
