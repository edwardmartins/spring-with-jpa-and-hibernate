package com.curso.service;

import java.util.List;

import com.curso.model.Cliente;

public interface ClienteService {
	void altaCliente(Cliente cliente);
	boolean loginCliente(String user, String pass);
	List<Cliente> recuperarClientes();
}
