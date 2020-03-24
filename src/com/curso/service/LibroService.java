package com.curso.service;

import java.util.List;

import com.curso.model.Libro;
import com.curso.model.Tema;

public interface LibroService {
	List<Libro> recuperarLibros();
	List<Libro> recuperarLibrosPorTema(int topic);
	List<Tema> recuperarTemas();
}
