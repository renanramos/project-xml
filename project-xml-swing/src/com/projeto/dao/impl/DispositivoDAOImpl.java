package com.projeto.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.projeto.dao.DispositivoDAO;
import com.projeto.entity.generated.Dispositivo;

@Repository
public class DispositivoDAOImpl implements DispositivoDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void createDispositivo(Dispositivo dispositivo) {		
		entityManager.persist(dispositivo);
	}

	@Override
	public List<Dispositivo> getAllDispositivos() {
		return entityManager.createQuery("from Dispositivo", Dispositivo.class).getResultList();
	}

	@Override
	public Dispositivo getDispositivoById(Integer id) {
		return entityManager.find(Dispositivo.class, id);
	}

}
