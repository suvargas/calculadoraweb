package co.edu.icesi.demo.businessdelegate;

import java.util.List;

import co.edu.icesi.demo.modelo.Clientes;
import co.edu.icesi.demo.modelo.TiposDocumentos;

public interface IBusinessDelegate {

	public void saveCliente(Clientes entity) throws Exception;
	public void updateCliente(Clientes entity) throws Exception;
	public void deleteCliente(Clientes entity) throws Exception;
	public Clientes findByIdCliente(Long tdocCodigo) throws Exception;
	public List<Clientes> findAllClientes() throws Exception;
	
	public TiposDocumentos findByIdTipoDocumento(Long tdocCodigo);
	public List<TiposDocumentos> findAllTipoDocumento();
	
}
