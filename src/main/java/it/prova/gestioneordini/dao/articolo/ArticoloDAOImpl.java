package it.prova.gestioneordini.dao.articolo;

import java.util.List;

import javax.persistence.EntityManager;

import it.prova.gestioneordini.model.Articolo;
import it.prova.gestioneordini.model.Ordine;

public class ArticoloDAOImpl implements ArticoloDAO{

	@Override
	public void setEntityManager(EntityManager entityManager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Articolo> list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articolo get(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Articolo o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Articolo o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Articolo o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int totalSumOfArticlesByACertianOrder(Ordine ordineInput) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}