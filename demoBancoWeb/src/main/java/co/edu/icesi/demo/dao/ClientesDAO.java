package co.edu.icesi.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import co.edu.icesi.demo.modelo.Clientes;
import co.edu.icesi.demo.modelo.TiposDocumentos;

@Repository
@Scope("singleton")
public class ClientesDAO implements IClientesDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void save(Clientes entity) {
		entityManager.persist(entity);		
		
	}

	@Override
	public void update(Clientes entity) {
		entityManager.merge(entity);		
		
	}

	@Override
	public void delete(Clientes entity) {
		
		entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
		
	}

	@Override
	public Clientes findById(Long tdocCodigo) {
		return entityManager.find(Clientes.class, tdocCodigo);		
	}

	@Override
	public List<Clientes> findAll() {
		String jpql = "Select cli from Clientes cli";
		return 	entityManager.createQuery(jpql).getResultList();	
	}

}
