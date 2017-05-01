/*
 * Interface DispositivoDAO
 * 
 * Utilizada para especificar os m�todos 
 * obrigat�rios a serem implementados pelas classes
 * que a implementam.
 * 
 */

package com.projeto.dao;

import java.util.List;

import com.projeto.entity.generated.Dispositivo;

public interface DispositivoDAO {
		
	public void createDispositivo(Dispositivo dispositivo);
	
	public Dispositivo getDispositivoById(Integer id);
	
	public List<Dispositivo> getAllDispositivos();
	
}
