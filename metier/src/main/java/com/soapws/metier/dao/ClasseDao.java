package com.soapws.metier.dao;

import com.soapws.metier.config.HibernateUtil;
import com.soapws.metier.entity.Classe;
import com.soapws.metier.entity.Sector;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

public class ClasseDao extends RepositoryImpl<Classe> implements IClasseDao {
    private  final Session session = HibernateUtil.getSessionFactory().openSession();

    public ClasseDao() {
        super();
    }
    public List<Classe> findBySectorId(Long sectorId) {
        String hql = "FROM Classe c WHERE c.sector.id = :sectorId";
        Query query = session.createQuery(hql);
        query.setParameter("sectorId", sectorId);
        return query.getResultList();
    }

    public Classe findByClassName(String className) {
        String hql = "FROM Classe c WHERE c.className = :name";
        Query query = session.createQuery(hql);
        query.setParameter("name", className);
        return (Classe) query.getSingleResult();
    }
    public List<Classe> findBySector(Sector sector) {
        String jpql = "FROM Classe WHERE sector = :sector";
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery(jpql, Classe.class)
                    .setParameter("sector", sector)
                    .list();
        }
    }


}
