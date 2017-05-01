//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2017.04.29 às 11:40:37 PM BRT 
//


package com.projeto.entity.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Dispositivo_QNAME = new QName("", "dispositivo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dispositivo }
     * 
     */
    public Dispositivo createDispositivo() {
        return new Dispositivo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dispositivo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dispositivo")
    public JAXBElement<Dispositivo> createDispositivo(Dispositivo value) {
        return new JAXBElement<Dispositivo>(_Dispositivo_QNAME, Dispositivo.class, null, value);
    }

}
