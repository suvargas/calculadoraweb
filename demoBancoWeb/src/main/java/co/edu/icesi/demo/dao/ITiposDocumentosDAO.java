package co.edu.icesi.demo.dao;

import java.util.List;

import co.edu.icesi.demo.modelo.TiposDocumentos;

public interface ITiposDocumentosDAO {

	public void save(TiposDocumentos entity);
	public void update(TiposDocumentos entity);
	public void delete(TiposDocumentos entity);
	public TiposDocumentos findById(Long tdocCodigo);
	public List<TiposDocumentos> findAll();

}
