package it.prova.gestioneordini.dao.ordine;

import java.util.List;

import javax.persistence.EntityManager;

import it.prova.gestioneordini.model.Categoria;
import it.prova.gestioneordini.model.Ordine;

public class OrdineDAOImpl implements OrdineDAO{
	
	private EntityManager entityManager;

	@Override
	public void setEntityManager(EntityManager entityManager) {
		// TODO Auto-generated method stub
		this.entityManager = entityManager;
	}

	@Override
	public List<Ordine> list() throws Exception {
		// TODO Auto-generated method stub
		return entityManager.createQuery("FROM Ordine", Ordine.class).getResultList();
	}

	@Override
	public Ordine get(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Ordine o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Ordine o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Ordine o) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ordine> findAllOrdersWithACertianCategory(Categoria catecoriaInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ordine> findAllRecentOrdersOfACertianCategory(Categoria categoriaInput) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}