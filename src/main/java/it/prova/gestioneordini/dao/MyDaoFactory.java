package it.prova.gestioneordini.dao;

import it.prova.gestioneordini.dao.articolo.ArticoloDAO;
import it.prova.gestioneordini.dao.articolo.ArticoloDAOImpl;
import it.prova.gestioneordini.dao.categoria.CategoriaDAO;
import it.prova.gestioneordini.dao.categoria.CategoriaDAOImpl;
import it.prova.gestioneordini.dao.ordine.OrdineDAO;
import it.prova.gestioneordini.dao.ordine.OrdineDAOImpl;

public class MyDaoFactory {
	public static OrdineDAO ordineDaoInstance;
	public static ArticoloDAO articoloDaoInstance;
	public static CategoriaDAO categotriaDaoInstance;
	
	public static OrdineDAO getOrdineDAOInstance() {
		if (ordineDaoInstance == null)
			ordineDaoInstance = new OrdineDAOImpl();

		return ordineDaoInstance;
	}

	public static ArticoloDAO getArticoloDAOInstance() {
		if (articoloDaoInstance == null)
			articoloDaoInstance = new ArticoloDAOImpl();

		return articoloDaoInstance;
	}
	
	public static CategoriaDAO getCategoriaDAOInstance() {
		if(categotriaDaoInstance == null)
			categotriaDaoInstance = new CategoriaDAOImpl();
		
		return categotriaDaoInstance;
	}
	
}
