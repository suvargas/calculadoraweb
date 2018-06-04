package co.edu.icesi.demo.logica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import co.edu.icesi.demo.dao.ITiposDocumentosDAO;
import co.edu.icesi.demo.modelo.TiposDocumentos;

@Service
@Scope("singleton")
public class TipoDocumentoLogic implements ITipoDocumentoLogic {
	
	@Autowired
	private ITiposDocumentosDAO tiposDocumentoDAO;

	@Override
	@Transactional(readOnly=true)
	public TiposDocumentos findById(Long tdocCodigo) {
		return tiposDocumentoDAO.findById(tdocCodigo);
	}

	@Override
	@Transactional(readOnly=true)
	public List<TiposDocumentos> findAll() {		
		return tiposDocumentoDAO.findAll();
	}

}
