package co.edu.icesi.demo.dao;

import java.util.List;

import co.edu.icesi.demo.modelo.Clientes;

public interface IClientesDAO {

	public void save(Clientes entity);
	public void update(Clientes entity);
	public void delete(Clientes entity);
	public Clientes findById(Long tdocCodigo);
	public List<Clientes> findAll();
}
