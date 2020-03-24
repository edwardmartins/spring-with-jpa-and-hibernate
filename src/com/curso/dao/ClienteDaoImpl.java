package com.curso.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.curso.model.Cliente;


@Repository
public class ClienteDaoImpl implements ClienteDao {

	@PersistenceContext // inyectamos el entity manager
	EntityManager em;
	
	@Transactional
	@Override
	public void save(Cliente cliente) {
		em.persist(cliente);
	}

	@Override
	public Cliente findByUserName(String userName) {
		String jpql="Select c From Cliente c Where c.usuario=?1";
		TypedQuery<Cliente> query = em.createQuery(jpql,Cliente.class);
		query.setParameter(1, userName);
		List<Cliente> result = query.getResultList();
		return result.size() > 0 ? result.get(0) : null;
	}

	@Override
	public List<Cliente> findAll() {
		TypedQuery<Cliente> query = em.createNamedQuery("Cliente.findAll", Cliente.class);
		return query.getResultList();
	}
}