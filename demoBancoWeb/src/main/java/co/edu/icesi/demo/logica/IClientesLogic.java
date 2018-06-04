package co.edu.icesi.demo.logica;

import java.util.List;

import co.edu.icesi.demo.modelo.Clientes;

public interface IClientesLogic {

	public void save(Clientes entity) throws Exception;
	public void update(Clientes entity) throws Exception;
	public void delete(Clientes entity) throws Exception;
	public Clientes findById(Long tdocCodigo) throws Exception;
	public List<Clientes> findAll() throws Exception;
	
}
