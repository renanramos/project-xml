# project-xml

<a href="https://github.com/renanramos/project-xml/tree/master/project-xml-swing">Project-Xml</a> é um programa standalone/desktop desenvolvido para realizar a leitura de um arquvio xml em um servidor FTP e fazer a 
persistência dos dados, em um banco de dados. O arquivo possui informações a respeito das características de dispositivos conectados na rede.
Os dados persistidos através do <a href="https://github.com/renanramos/project-xml/tree/master/project-xml-ws">project-xml-ws</a> são disponibilizados para consulta através de um Web Service Rest acessando as seguintes URLS:

<a href="#">http://localhost:8080/ProjectXmlWS/rest/{id}</a> : para consulta de um item específico cadastrado, onde <i>id</i> é o identificador do item;

<a href="#">http://localhost:8080/ProjectXmlWS/rest/dispositivo</a> : para consulta de todos os itens cadastrados.

# Tecnologias project-xml-swing

<ul>
  <li>Java Swing</li>
  <li>Spring Framework 4.3.4.RELEASE</li>
  <li>Spring Data JPA 1.11.1.RELEASE</li>
  <li>Hibernate 5.2.10.Final</li>
  <li>JAXB 2.2.6</li>
  <li>MySql 6.0.6</li>
  <li>Maven 3.5.1</li>
</ul>

# Tecnologias project-xml-ws

<ul>
  <li>Jaxrs 2.22.1</li>  
  <li>Hibernate 5.2.10.Final</li>
  <li>JUnit 4.12</li>
  <li>Jackson 2.6.3</li>
  <li>MySql 6.0.6</li>
  <li>Maven 3.5.1</li>
</ul>

