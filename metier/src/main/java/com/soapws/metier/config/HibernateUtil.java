package com.soapws.metier.config;

import com.soapws.metier.entity.Classe;
import com.soapws.metier.entity.Sector;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			// Charger les propriétés depuis database.properties
			Properties props = new Properties();
			props.load(HibernateUtil.class.getClassLoader().getResourceAsStream("database.properties"));

			Configuration configuration = new Configuration();
			configuration.setProperties(props);

			// Ajouter les entités annotées
			configuration.addAnnotatedClass(Classe.class);
			configuration.addAnnotatedClass(Sector.class);

			StandardServiceRegistryBuilder builder =
					new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

			return configuration.buildSessionFactory(builder.build());

		} catch (Exception ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError("Échec de l'initialisation de la SessionFactory");
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}
}
