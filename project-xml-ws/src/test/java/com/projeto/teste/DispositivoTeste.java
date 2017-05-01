package com.projeto.teste;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projeto.entity.Dispositivo;

public class DispositivoTeste{

	private Client client;
	private WebTarget target;

	@Before
	public void startaServidor(){		
		ClientConfig config = new ClientConfig();
		config.register(new LoggingFilter());		
		this.client = ClientBuilder.newClient(config);
		this.target = client.target("http://localhost:8080/ProjectXmlWS/");
	}

	@Test
	public void buscaDispositivoPorId() throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		String content = target.path("rest/dispositivo/1").request().get(String.class);				
		Dispositivo d = mapper.readValue(content, Dispositivo.class);
		Assert.assertEquals("Jorge Henrique", d.getNomeProprietario());						
	}

	@Test
	public void buscaDispositivos() throws JsonParseException, JsonMappingException, IOException{		
		String content = target.path("rest/dispositivo").request().get(String.class);		
		Assert.assertNotNull(content);
	}
}
