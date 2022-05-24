package it.prova.gestioneordini.service;

import java.util.List;

import it.prova.gestioneordini.dao.articolo.ArticoloDAO;
import it.prova.gestioneordini.model.Articolo;
import it.prova.gestioneordini.model.Categoria;
import it.prova.gestioneordini.model.Ordine;

public interface ArticoloService {
	public void setArticoloDAO(ArticoloDAO articoloDaoInstance) throws Exception;

	public List<Articolo> listAll() throws Exception;

	public Articolo caricaSingoloElemento(Long id) throws Exception;

	public Articolo caricaSingoloElementoEagerGeneri(Long id) throws Exception;

	public void aggiorna(Articolo articoloInstance) throws Exception;

	public void inserisciNuovo(Articolo articoloInstance) throws Exception;

	public void rimuovi(Long idCd) throws Exception;

	public void aggiungiCategoria(Articolo articoloInstance, Categoria categoriaInstance) throws Exception;

	public void creaECollegaArticoloECategoria(Articolo articoloTransientInstance, Categoria categoriaTransientInstance)
			throws Exception;
	
	public int sommaTotaleDegliArticoliDiUnCertoOrdine(Ordine ordineInput) throws Exception;
	
}