package com.curso.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.model.Cliente;
import com.curso.service.ClienteService;
import com.curso.service.LibroService;

@Controller
public class ClienteController {
	
	@Autowired
	ClienteService serviceClient;
	
	@Autowired
	LibroService serviceBook;

	

	@PostMapping(value="/alta")
	public String altaCliente(@RequestParam("usuario")String usuario,
								@RequestParam("pass")String password,
								@RequestParam("email")String email,
								@RequestParam("telef")int telefono
								) {
		
		Cliente cliente = new Cliente(usuario, password, email, telefono);
		serviceClient.altaCliente(cliente);
		return "login";		
	}
	
	@PostMapping(value="/login")
	public String altaCliente(@RequestParam("usuario")String usuario,
								@RequestParam("pass")String password,
								HttpServletRequest request) {
		
		boolean result = serviceClient.loginCliente(usuario,password);
		return  result ? "forward:/temas" : "loginIncorrecto";
	}
		
}
