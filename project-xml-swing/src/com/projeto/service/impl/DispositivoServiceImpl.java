package com.projeto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.dao.DispositivoDAO;
import com.projeto.entity.generated.Dispositivo;
import com.projeto.service.DispositivoService;

@Transactional
@Service
public class DispositivoServiceImpl implements DispositivoService{

	@Autowired
	private DispositivoDAO dispositivoDAO;

	@Override
	public void createDispositivo(Dispositivo dispositivo) {		
		dispositivoDAO.createDispositivo(dispositivo);		
	}

	@Override
	public List<Dispositivo> getAllDispositivos() {
		return dispositivoDAO.getAllDispositivos();
	}

	@Override
	public Dispositivo getDispositivoById(Integer id) {
		return dispositivoDAO.getDispositivoById(id);
	}

		
	
	
}
