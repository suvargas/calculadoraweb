package co.edu.icesi.demo.logica;

import java.util.List;

import co.edu.icesi.demo.modelo.TiposDocumentos;

public interface ITipoDocumentoLogic {

	public TiposDocumentos findById(Long tdocCodigo);
	public List<TiposDocumentos> findAll();
	
}
