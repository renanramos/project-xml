package com.projeto.util.xml;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;

import com.projeto.entity.generated.Dispositivo;

public class ParserXml {

	public Object obtemConteudoXML(String url, Object object) throws JAXBException, MalformedURLException {
		object = JAXB.unmarshal(new URL(url), Dispositivo.class);
		return object;
	}

}
