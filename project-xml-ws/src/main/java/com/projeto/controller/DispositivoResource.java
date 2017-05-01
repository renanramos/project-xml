package com.projeto.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.projeto.entity.Dispositivo;
import com.projeto.repository.DispositivoRepository;

@Path("dispositivo")
public class DispositivoResource {

	private DispositivoRepository dispositivoRepository = new DispositivoRepository();
			
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Dispositivo buscaDispositivoPorId(@PathParam("id")Integer id){
		Dispositivo dispositivo = dispositivoRepository.getDispositivoById(id);
		return dispositivo;
	}	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Dispositivo> todosDispositivos(){
		List<Dispositivo> dispositivos = new ArrayList<Dispositivo>();
		List<Dispositivo> listaDispositivos = dispositivoRepository.getAllDispositivos();
		
		for(Dispositivo entity : listaDispositivos){
			Dispositivo dispositivo = new Dispositivo();
			dispositivo.setId(entity.getId());
			dispositivo.setNome(entity.getNome());
			dispositivo.setNomeFabricante(entity.getNomeFabricante());
			dispositivo.setNomeProprietario(entity.getNomeProprietario());
			dispositivo.setNumeroIp(entity.getNumeroIp());
			dispositivo.setStatus(entity.getStatus());
			dispositivos.add(dispositivo);
		}
		
		return dispositivos;
	}
	
}
