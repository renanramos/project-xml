/*
 * Interface DispositivoService
 * 
 * Utilizada para especificar os métodos 
 * obrigatórios a serem implementados pelas classes
 * que a implementam.
 * 
 */
package com.projeto.service;

import java.util.List;

import com.projeto.entity.generated.Dispositivo;


public interface DispositivoService {

	public void createDispositivo(Dispositivo dispositivo);

	public Dispositivo getDispositivoById(Integer id);
	
	public List<Dispositivo> getAllDispositivos();
}
