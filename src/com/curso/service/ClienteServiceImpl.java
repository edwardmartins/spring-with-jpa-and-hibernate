package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.ClienteDao;
import com.curso.model.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClienteDao dao;

	@Override
	public void altaCliente(Cliente cliente) {
		dao.save(cliente);
	}

	@Override
	public boolean loginCliente(String userName, String pass) {
		Cliente cliente = dao.findByUserName(userName);
		return cliente != null && cliente.getPassword().equals(pass);
	}

	@Override
	public List<Cliente> recuperarClientes() {
		return dao.findAll();
	}
	
	

}
