package it.prova.gestioneordini.dao.categoria;

import java.util.List;

import it.prova.gestioneordini.dao.IBaseDAO;
import it.prova.gestioneordini.model.Categoria;
import it.prova.gestioneordini.model.Ordine;

public interface CategoriaDAO extends IBaseDAO<Categoria>{
	
	public List<Categoria> findAllCategoriesDistinctByArticlesOfACertianOrder(Ordine ordineInput) throws Exception;
	
	public boolean findIfCategoriessHaveArticles(Long Categorie) throws Exception;
	
	public List<String> AllDistinctCodeFromOrdersAtFebruary() throws Exception;
	
}
