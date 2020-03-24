package com.curso.dao;

import java.util.List;

import com.curso.model.Cliente;

public interface ClienteDao {
	void save(Cliente cliente);
	Cliente findByUserName(String userName);
	List<Cliente> findAll();
}
