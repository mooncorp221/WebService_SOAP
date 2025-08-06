# Utilise l'image officielle Tomcat
FROM tomcat:10.1.43-jdk17

# Supprime les apps par défaut (ex: ROOT)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copie ton fichier WAR dans Tomcat
COPY soap/target/soap.war /usr/local/tomcat/webapps/soap.war

# Expose le port utilisé par Tomcat
EXPOSE 8080
