package co.edu.icesi.demo.businessdelegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import co.edu.icesi.demo.logica.IClientesLogic;
import co.edu.icesi.demo.logica.ITipoDocumentoLogic;
import co.edu.icesi.demo.modelo.Clientes;
import co.edu.icesi.demo.modelo.TiposDocumentos;

@Component("businessDelegate")
@Scope("singleton")
public class BusinessDelegate implements IBusinessDelegate{

	@Autowired
	private IClientesLogic clienteLogic;
	@Autowired
	private ITipoDocumentoLogic documentoLogic;
	
	
	@Override
	public void saveCliente(Clientes entity) throws Exception {
		clienteLogic.save(entity);		
	}

	@Override
	public void updateCliente(Clientes entity) throws Exception {
		clienteLogic.update(entity);		
	}

	@Override
	public void deleteCliente(Clientes entity) throws Exception {
		clienteLogic.delete(entity);		
	}

	@Override
	public Clientes findByIdCliente(Long tdocCodigo) throws Exception {
		// TODO Auto-generated method stub
		return clienteLogic.findById(tdocCodigo);
	}

	@Override
	public List<Clientes> findAllClientes() throws Exception {
		// TODO Auto-generated method stub
		return clienteLogic.findAll();
	}

	@Override
	public TiposDocumentos findByIdTipoDocumento(Long tdocCodigo) {
		// TODO Auto-generated method stub
		return documentoLogic.findById(tdocCodigo);
	}

	@Override
	public List<TiposDocumentos> findAllTipoDocumento() {
		// TODO Auto-generated method stub
		return documentoLogic.findAll();
	}

}
