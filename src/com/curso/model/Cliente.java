package com.curso.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the clientes database table.
 * 
 */
@Entity
@Table(name = "clientes")
@NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;

	private String usuario;
	private String password;
	private String email;
	private int telefono;

	public Cliente(String usuario, String password, String email, int telefono) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.email = email;
		this.telefono = telefono;
	}

	public Cliente() {
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}