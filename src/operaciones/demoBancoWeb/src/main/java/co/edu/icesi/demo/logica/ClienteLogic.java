package co.edu.icesi.demo.logica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import co.edu.icesi.demo.dao.ClientesDAO;
import co.edu.icesi.demo.dao.IClientesDAO;
import co.edu.icesi.demo.dao.ITiposDocumentosDAO;
import co.edu.icesi.demo.modelo.Clientes;
import co.edu.icesi.demo.modelo.TiposDocumentos;

@Service
@Scope("singleton")
public class ClienteLogic implements IClientesLogic{

	@Autowired
	private ITiposDocumentosDAO tiposDocumentosDAO;
	
	@Autowired
	private IClientesDAO clientesDAO;
	
	@Override
	@Transactional(readOnly=false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void save(Clientes entity) throws Exception {

//		if(entity != null) {
//			if(entity.getCliId() != 0) {
//				
//			}else{
			//}
//		}else{}
		
		if(entity == null) {
			throw new Exception("El cliente no puede ser nulo");
		}
		if(entity.getCliId() == 0) {
			throw new Exception("El id del cliente no puede ser cero");
		}
		if(entity.getCliDireccion() == null || entity.getCliDireccion().trim().equals("") ) {
			throw new Exception("La dirección no puede ser nula o estar en blanco");
		}
		
		if(entity.getCliMail() == null || entity.getCliMail().trim().equals("") ) {
			throw new Exception("El Email no puede ser nula o estar en blanco");
		}
		
		if(entity.getCliNombre() == null || entity.getCliNombre().trim().equals("") ) {
			throw new Exception("El Nombre no puede ser nula o estar en blanco");
		}
		
		if(entity.getCliTelefono() == null || entity.getCliTelefono().trim().equals("") ) {
			throw new Exception("El teléfono no puede ser nulo o estar en blanco");
		}
		
		if(entity.getTiposDocumentos() == null || entity.getTiposDocumentos().getTdocCodigo() == 0 ) {
			throw new Exception("El tipo de documento no puede ser nulo");
		}
		
		//se debe consultar si el tipo de documento existe
		TiposDocumentos tipoDocu = tiposDocumentosDAO.findById(entity.getTiposDocumentos().getTdocCodigo());
		
		if(tipoDocu == null) {
			throw new Exception("El tipo de documento con id: "+entity.getTiposDocumentos().getTdocCodigo()+ " NO existe");
		}
		
		//Validar que el cliente NO exista
		
		
		
		clientesDAO.save(entity);
		
	}

	@Override
	@Transactional(readOnly=false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void update(Clientes entity) throws Exception {
		
		if(entity == null) {
			throw new Exception("El cliente no puede ser nulo");
		}
		if(entity.getCliId() == 0) {
			throw new Exception("El id del cliente no puede ser cero");
		}
		if(entity.getCliDireccion() == null || entity.getCliDireccion().trim().equals("") ) {
			throw new Exception("La dirección no puede ser nula o estar en blanco");
		}
		
		if(entity.getCliMail() == null || entity.getCliMail().trim().equals("") ) {
			throw new Exception("El Email no puede ser nula o estar en blanco");
		}
		
		if(entity.getCliNombre() == null || entity.getCliNombre().trim().equals("") ) {
			throw new Exception("El Nombre no puede ser nula o estar en blanco");
		}
		
		if(entity.getCliTelefono() == null || entity.getCliTelefono().trim().equals("") ) {
			throw new Exception("El teléfono no puede ser nulo o estar en blanco");
		}
		
		if(entity.getTiposDocumentos() == null || entity.getTiposDocumentos().getTdocCodigo() == 0 ) {
			throw new Exception("El tipo de documento no puede ser nulo");
		}
		
		//se debe consultar si el tipo de documento existe
		TiposDocumentos tipoDocu = tiposDocumentosDAO.findById(entity.getTiposDocumentos().getTdocCodigo());
		
		if(tipoDocu == null) {
			throw new Exception("El tipo de documento con id: "+entity.getTiposDocumentos().getTdocCodigo()+ " NO existe");
		}
		
		entity.setTiposDocumentos(tipoDocu);
		
		clientesDAO.update(entity);
		
		
	}

	@Override
	@Transactional(readOnly=false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void delete(Clientes entity) throws Exception {
		
		if(entity == null) {
			throw new Exception("El cliente no puede ser nulo");
		}
		if(entity.getCliId() == 0) {
			throw new Exception("El id del cliente no puede ser cero");
		}
		clientesDAO.delete(entity);
	}

	@Override
	@Transactional(readOnly=true)
	public Clientes findById(Long tdocCodigo) throws Exception {
		return clientesDAO.findById(tdocCodigo);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Clientes> findAll() throws Exception {
		return clientesDAO.findAll();
	}

}
