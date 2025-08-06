# SOAP Web Service - Sectors & Classes

Ce projet Java expose un Web Service SOAP pour gérer des **secteurs** et des **classes**. Il est organisé en deux modules principaux :

* `metier/` : logique métier (entités JPA, services, mappers, DAO)
* `soap/` : exposition des services via SOAP avec JAX-WS

---

## Fonctionnalités

### Secteurs (Sector)

* `addSector(SectorDto dto)` : ajouter un secteur
* `getAllSectors()` : récupérer tous les secteurs
* `getSectorById(int id)` : récupérer un secteur par ID
* `updateSector(SectorDto dto)` : modifier un secteur
* `deleteSector(int id)` : supprimer un secteur

### Classes (Classe)

* `addClasse(ClasseDto dto)` : ajouter une classe
* `getAllClasses()` : récupérer toutes les classes
* `getClasseById(int id)` : récupérer une classe par ID
* `deleteClasse(int id)` : supprimer une classe
* `getClassesBySector(String sectorName)` : récupérer les classes d'un secteur

---

## technique

* Java 17
* JAX-WS (SOAP)
* Hibernate ORM + PostgreSQL
* Tomcat 9 ou 10
* JAXB pour la sérialisation XML

---

## Configuration Hibernate

Fichier `database.properties` dans `src/main/resources` :

```properties
hibernate.connection.url=jdbc:postgresql://localhost:5432/soap_db
hibernate.connection.username=postgres
hibernate.connection.password=postgres
hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
hibernate.hbm2ddl.auto=update
hibernate.show_sql=true
```

---

## Accès aux WSDL

* [http://localhost:8080/soap/classe?wsdl](http://localhost:8080/soap/classe?wsdl)
* [http://localhost:8080/soap/sector?wsdl](http://localhost:8080/soap/sector?wsdl)

---

## Exemple de requête SOAP - `addClasse`

```xml
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://service.webservice.soapws.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:addClasse>
         <dto>
            <id>0</id>
            <className>M1GL</className>
            <description>Master 1 Genie Logiciel</description>
            <sectorId>1</sectorId>
         </dto>
      </ser:addClasse>
   </soapenv:Body>
</soapenv:Envelope>
```

---

## Déploiement

1. Compiler le projet : `mvn clean install`
2. Générer le fichier WAR : `soap.war`
3. Déposer dans le dossier `webapps/` de Tomcat
4. Accéder à : `http://localhost:8080/soap/`

---

## Tests avec SoapUI

1. Créer un projet SOAP dans SoapUI
2. Fournir le WSDL : `http://localhost:8080/soap/classe?wsdl`
3. SoapUI génère les opérations disponibles
4. Envoyer des requêtes (voir exemple ci-dessus)

---



**Mouhamed NDIAYE** - M1GLISI


> Pour toute contribution, n'hésitez pas à forker le repo et proposer un pull request.
