package it.prova.gestioneordini.dao.ordine;

import java.util.List;

import it.prova.gestioneordini.dao.IBaseDAO;
import it.prova.gestioneordini.model.Categoria;
import it.prova.gestioneordini.model.Ordine;


public interface OrdineDAO extends IBaseDAO<Ordine>{
	
	public List<Ordine> findAllOrdersWithACertianCategory(Categoria catecoriaInput) throws Exception;
	
	public List<Ordine> findAllRecentOrdersOfACertianCategory(Categoria categoriaInput) throws Exception;
	
}