package com.curso.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.model.Tema;
import com.curso.service.LibroService;

@Controller
public class LibroController {

	@Autowired
	LibroService service;

	@RequestMapping(value = "/temas")
	public String recuperarTemas(HttpServletRequest request) {
		List<Tema> lista = service.recuperarTemas();
		request.setAttribute("temas", lista);
		return "temas";
	}

	@PostMapping(value = "/libros")
	public String recuperarLibros(@RequestParam("topic") int topic, 
								HttpServletRequest request) {
		if (topic == 0) { // ha elegido todos
			request.setAttribute("libros", service.recuperarLibros());
		} else {
			request.setAttribute("libros", service.recuperarLibrosPorTema(topic));
		}
		return "libros";
	}

}
