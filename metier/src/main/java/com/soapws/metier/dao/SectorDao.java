package com.soapws.metier.dao;

import com.soapws.metier.config.HibernateUtil;
import com.soapws.metier.entity.Sector;
import org.hibernate.Session;

;

public class SectorDao extends RepositoryImpl<Sector> implements ISectorDao {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    public SectorDao() {
        super();
    }

    public Sector findByName(String name) {
        String jpql = "FROM Sector WHERE name = :name";
        try (Session sessions = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery(jpql, Sector.class)
                    .setParameter("name", name)
                    .uniqueResult();
        }
    }
    @Override
    public boolean save(Sector entity) {
        try {
            session.getTransaction().begin();
            session.save(entity);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(); // Ajoute ça
            session.getTransaction().rollback();
            return false;
        }
    }


}
