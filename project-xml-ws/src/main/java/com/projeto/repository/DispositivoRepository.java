package com.projeto.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.projeto.entity.Dispositivo;

public class DispositivoRepository {

	private final EntityManagerFactory entityManagerFactory;
	
	private final EntityManager entityManager;
		
	public DispositivoRepository() {
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistenceProjeto");
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}

	@SuppressWarnings("unchecked")
	public List<Dispositivo> getAllDispositivos(){
		Query query = entityManager.createQuery("select d from Dispositivo d");		
		return query.getResultList();
	}
	
	public Dispositivo getDispositivoById(Integer id){
		Dispositivo dispositivo = new Dispositivo();
		Query query = entityManager.createQuery("select d from Dispositivo d where d.id=:id");
		query.setParameter("id", id);
		dispositivo = (Dispositivo) query.getSingleResult();
		return dispositivo;
	}
	
}
